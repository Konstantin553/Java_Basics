package tasks;

import java.util.Scanner;

public class ChangeTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double floorWidth = Double.parseDouble(scanner.nextLine());
        double floorLength = Double.parseDouble(scanner.nextLine());
        double triangleSide = Double.parseDouble(scanner.nextLine());
        double triangleHeight = Double.parseDouble(scanner.nextLine());
        double priceForOneTile = Double.parseDouble(scanner.nextLine());
        double sumaZaMaster = Double.parseDouble(scanner.nextLine());

        double floorArea = floorWidth * floorLength;
        double tileArea = triangleSide * triangleHeight / 2;
        double tileNeeded = Math.ceil(floorArea / tileArea + 5);
        double totalMoney = tileNeeded * priceForOneTile + sumaZaMaster;


        if (totalMoney > budget) {
            double moneyNeeded = totalMoney - budget;
            System.out.printf("You'll need %.2f lv more.", moneyNeeded);
        } else {
            double moneyLeft = budget - totalMoney;
            System.out.printf("%.2f lv left.", moneyLeft);
        }

    }
}
