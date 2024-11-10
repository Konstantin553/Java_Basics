package tasks;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int divisibleby2 = 0;
        int divisibleby3 = 0;
        int divisibleby4 = 0;

        double p2Percentage = 0;
        double p3Percentage = 0;
        double p4Percentage = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = scanner.nextInt();

            if (currentNumber % 2 == 0) {
                 divisibleby2++;
            } else if (currentNumber % 3 == 0) {
                divisibleby3++;
            } else if (currentNumber % 4 == 0) {
                divisibleby4++;
            }
        }

        p2Percentage = divisibleby2 * 100.00 / n;
        p3Percentage = divisibleby3 * 100.00 / n;
        p4Percentage = divisibleby4 * 100.00 / n;

        System.out.println(String.format("%.2f%%", p2Percentage));
        System.out.println(String.format("%.2f%%", p3Percentage));
        System.out.println(String.format("%.2f%%", p4Percentage));


    }
}
