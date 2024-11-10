import java.text.DecimalFormat;
import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String city = scanner.nextLine().toLowerCase();
        double sales = Double.parseDouble(scanner.nextLine());
        double price = -1;

        if (city.equals("sofia")) {
            if (sales >= 0 && sales <= 500) {
                price = sales * 0.05;
            } else if (sales >= 500 && sales <= 1000) {
                price = sales * 0.07;
            } else if (sales >= 1000 && sales <= 10000) {
                price = sales * 0.08;
            } else if (sales > 10000) {
                price = sales * 0.12;
            } 
        }if (city.equals("varna")) {
            if (sales >= 0 && sales <= 500) {
                price = sales * 0.045;
            } else if (sales >= 500 && sales <= 1000) {
                price = sales * 0.075;
            } else if (sales >= 1000 && sales <= 10000) {
                price = sales * 0.10;
            } else if (sales > 10000) {
                price = sales * 0.13;
            }
        }if (city.equals("plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                price = sales * 0.055;
            } else if (sales >= 500 && sales <= 1000) {
                price = sales * 0.08;
            } else if (sales >= 1000 && sales <= 10000) {
                price = sales * 0.12;
            } else if (sales > 10000) {
                price = sales * 0.145;
            }
        }

        if (price >= 0) {
            System.out.println(decimalFormat.format(price));
        } else {
            System.out.println("error");
        }
    }
}
