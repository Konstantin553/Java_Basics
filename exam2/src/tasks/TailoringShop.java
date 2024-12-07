package tasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TailoringShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfTables = Integer.parseInt(scanner.nextLine());
        double tableLength = Double.parseDouble(scanner.nextLine());
        double tableWidth = Double.parseDouble(scanner.nextLine());

        double tableSquareMeters = numberOfTables * (tableLength + 2 * 0.30) * (tableWidth + 2 * 0.30);
        double carriageSquareMeters = numberOfTables * (tableLength / 2) * (tableLength / 2);
        double priceDollars = tableSquareMeters * 7 + carriageSquareMeters * 9;
        double priceLeva = priceDollars * 1.85;

        System.out.printf("%.2f USD\n", priceDollars);
        System.out.printf("%.2f BGN\n", priceLeva);


    }
}
