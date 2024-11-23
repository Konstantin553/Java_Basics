package tasks;

import java.util.Scanner;

public class dwarfsGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dwarfs = Integer.parseInt(scanner.nextLine());
        int santaBudget = Integer.parseInt(scanner.nextLine());

        double price = 0;


        for (int i = 0; i < dwarfs; i++) {
            String gifts = scanner.nextLine();
            if (gifts.equals("sand clock")) {
                price += 2.20;
            } else if (gifts.equals("magnet")) {
                price += 1.50;
            } else if (gifts.equals("cup")) {
                price += 5.00;
            } else if (gifts.equals("t-shirt")) {
                price += 10.00;
            }
        }

        if (santaBudget > price) {
            double moneyLeft = santaBudget - price;
            System.out.printf("Santa Claus has %.2f more leva left.", moneyLeft);
        } else {
            double moneyNeeded = price - santaBudget;
            System.out.printf("Santa Claus will need %.2f more leva.", moneyNeeded);
        }
    }
}
