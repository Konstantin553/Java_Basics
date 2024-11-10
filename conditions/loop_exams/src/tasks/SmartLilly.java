package tasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SmartLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        int age = scanner.nextInt();
        double washingPrice = scanner.nextDouble();
        int costPerToy = scanner.nextInt();

        int numberOfToys = 0;
        int savedMoney = 0;
        int moneyForBirthday = 10;


        for (int currentYear = 1; currentYear <= age; currentYear++) {
            if (currentYear % 2 == 0) {
                savedMoney += (moneyForBirthday - 1);
                moneyForBirthday += 10;
            } else {
                numberOfToys++;
            }
        }

        savedMoney += numberOfToys * costPerToy;

        if (savedMoney >= washingPrice) {
            System.out.println("Yes! " + decimalFormat.format((savedMoney - washingPrice)));
        } else {
            System.out.println("No! " + decimalFormat.format((washingPrice - savedMoney)));
        }


    }
}
