package tasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class santaStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        int wrapping_paper = Integer.parseInt(scanner.nextLine());
        int rolls_fabric = Integer.parseInt(scanner.nextLine());
        double liters_glue = Double.parseDouble(scanner.nextLine());
        int percentage_reduction = Integer.parseInt(scanner.nextLine());

        double total_price = (wrapping_paper * 5.80) + (rolls_fabric * 7.20) +
                (liters_glue * 1.20);

        double price_discount = total_price - ((total_price * percentage_reduction)/100);

        System.out.println(decimalFormat.format(price_discount));

    }
}
