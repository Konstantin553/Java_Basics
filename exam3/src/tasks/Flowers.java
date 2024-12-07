package tasks;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysantemumPurchased = Integer.parseInt(scanner.nextLine());
        int rosesPurchased = Integer.parseInt(scanner.nextLine());
        int tulipPurchased = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String isSpecialDay = scanner.nextLine();

        double roseAutumnWinterPrice = 4.50;
        double roseSpringSummerPrice = 4.10;
        double tulipAutumnWinterPrice = 4.15;
        double tulipSpringSummerPrice = 2.50;
        double chrysantemumAutumnWinterPrice = 3.75;
        double chrysantemumSpringSummerPrice = 2;
        double arangePrice = 2;

        double totalCost = 0;

        int priceIncreasePercentage = 15;

        int tulipPriceDecreasePercentage = 5;
        int rosePriceDecreasePercentage = 10;
        int totalPriceDecreasePercentage = 20;

        int tulipPriceDecreaseThreshold = 7;
        int rosePriceDecreaseThreshold = 10;
        int totalPriceDecreaseThreshold = 20;

        if ("winter".equals(season) || "Autumn".equals(season)) {
            double chrysantemumPrice = chrysantemumPurchased * chrysantemumAutumnWinterPrice;
            double rosesPrice = rosesPurchased * roseAutumnWinterPrice;
            double tulipPrice= tulipPurchased * tulipAutumnWinterPrice;
            totalCost = rosesPrice + tulipPrice + chrysantemumPrice;
            System.out.printf("%.2f", totalCost);
            System.out.println();
        } else {
            double rosesPrice = rosesPurchased * roseSpringSummerPrice;
            double chrysantemumPrice = chrysantemumPurchased * chrysantemumSpringSummerPrice;
            double tulipPrice= tulipPurchased * tulipSpringSummerPrice;
            totalCost = rosesPrice + chrysantemumPrice + tulipPrice;
            System.out.printf("%.2f", totalCost);
            System.out.println();
        }

        if ("Y".equals(isSpecialDay)) {
            totalCost += totalCost * priceIncreasePercentage / 100;
        }
        if (tulipPurchased > tulipPriceDecreaseThreshold) {
            totalCost -= totalCost * tulipPriceDecreasePercentage / 100;
        }  else if (rosesPurchased >= rosePriceDecreaseThreshold) {
            totalCost -= totalCost * rosePriceDecreasePercentage / 100;
        } else if (rosesPurchased + tulipPurchased + chrysantemumPurchased >= totalPriceDecreaseThreshold) {
            totalCost -= totalCost * totalPriceDecreasePercentage / 100;
            System.out.println(totalCost);
        }

        double lastPrice = totalCost + arangePrice;
        System.out.printf("%.2f", lastPrice);
    }
}
