import java.text.DecimalFormat;
import java.util.Scanner;

public class Cinemaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String type = scanner.nextLine().toLowerCase();
        int columns = Integer.parseInt(scanner.nextLine());
        int rows  = Integer.parseInt(scanner.nextLine());
        double earnings = 0;

        if (type.equals("premiere")) {
            earnings = (columns * rows) * 12.00;
        } else if (type.equals("normal")){
            earnings = (columns * rows) * 7.50;
        } else if (type.equals("discount")) {
            earnings = (columns * rows) * 5.00;
        }
        System.out.println(decimalFormat.format(earnings) + " leva");


    }
}
