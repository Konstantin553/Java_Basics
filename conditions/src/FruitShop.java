import java.text.DecimalFormat;
import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String product = scanner.nextLine();
        String day = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        
        if (day.equals("monday") || day.equals("tuesday") ||
                day.equals("wednesday") || day.equals("thursday") ||
                day.equals("friday")) {
            if (product.equals("banana")) {
                price = quantity * 2.50;
            } else if (product.equals("apple")) {
                price = quantity * 1.20;
            }else if (product.equals("orange")) {
                price = quantity * 0.85;
            }else if (product.equals("grapefruit")) {
                price = quantity * 1.45;
            }else if (product.equals("kiwi")) {
                price = quantity * 2.70;
            }else if (product.equals("pineapple")) {
                price = quantity * 5.50;
            }else if (product.equals("grapes")) {
                price = quantity * 3.85;
            } else {
                System.out.println("error");
            }
            System.out.println(decimalFormat.format(price));
        }

        if (day.equals("saturday") || day.equals("sunday"))  {
            if (product.equals("banana")) {
                price = quantity * 2.70;
            } else if (product.equals("apple")) {
                price = quantity * 1.25;
            }else if (product.equals("orange")) {
                price = quantity * 0.90;
            }else if (product.equals("grapefruit")) {
                price = quantity * 1.60;
            }else if (product.equals("kiwi")) {
                price = quantity * 3.00;
            }else if (product.equals("pineapple")) {
                price = quantity * 5.60;
            }else if (product.equals("grapes")) {
                price = quantity * 4.20;
            } else {
                System.out.println("error");
            }
            System.out.println(decimalFormat.format(price));

        }


    }
}
