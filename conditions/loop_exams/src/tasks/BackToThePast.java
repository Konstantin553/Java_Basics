package tasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        double heritage = scanner.nextDouble();
        int yearToLive = scanner.nextInt();

        int years = 18;

        for (int i = 1800; i <= yearToLive; i++) {
            if (i % 2 == 0) {
                heritage -= 12000;
            } else {
                heritage -= (12000 + 50 * years);
            }
            years++;
        }

        if (heritage > 0) {
            System.out.println("Yes! He will live a carefree life and will have " + decimalFormat.format(heritage)
                    + " dollars left");
        } else {
            System.out.println("He will need " + decimalFormat.format(Math.abs(heritage)) + " dollars to live" );
        }

    }
}
