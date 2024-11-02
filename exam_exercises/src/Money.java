import java.time.format.SignStyle;
import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double yuan = Double.parseDouble(scanner.nextLine());
        double comission = Double.parseDouble(scanner.nextLine()) / 100;

        double bitkoinToLeva = bitcoin * 1168;
        double yuanTodollar = yuan * 0.15;
        double dollarToleva = yuanTodollar * 1.76;
        double leva = bitkoinToLeva + dollarToleva;
        double euro = leva / 1.95;

        euro -= comission * euro;

        System.out.println(euro);

    }
}
