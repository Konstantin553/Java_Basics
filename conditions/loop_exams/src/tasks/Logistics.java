package tasks;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfLoads = scanner.nextInt();

        int sumOfTons = 0;
        int microbusTons = 0;
        int truckTons = 0;
        int trainTons = 0;

        double busPercentage = 0;
        double truckPercentage = 0;
        double trainPercentage = 0;

        for (int i = 0; i < countOfLoads - 1; i++) {
            int tons = scanner.nextInt();

            sumOfTons += tons;

            if (tons < 3) {
                microbusTons += tons;
            } else if (tons <= 11) {
                truckTons += tons;
            } else if (tons > 11) {
                trainTons += tons;
            }
        }

        double totalPrice = microbusTons + truckTons + trainTons;

        double averagePrice = totalPrice / sumOfTons;

        busPercentage = microbusTons  * 100 / totalPrice;
        truckPercentage = truckTons  * 100 / totalPrice;
        trainPercentage = trainTons  * 100 / totalPrice;

        System.out.println(String.format("%.2f%%", averagePrice));
        System.out.println(String.format("%.2f%%", busPercentage));
        System.out.println(String.format("%.2f%%", truckPercentage));
        System.out.println(String.format("%.2f%%", trainPercentage));

    }
}

