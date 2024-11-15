package tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the count of numbers
        int n = scanner.nextInt();

        double oddSum = 0;
        double evenSum = 0;

        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;

        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        // Process each number
        for (int i = 1; i <= n; i++) {
            double currentNumber = scanner.nextDouble();

            if (i % 2 != 0) {  // Odd position
                oddSum += currentNumber;
                if (currentNumber < oddMin) {
                    oddMin = currentNumber;
                }
                if (currentNumber > oddMax) {
                    oddMax = currentNumber;
                }
            } else {  // Even position
                evenSum += currentNumber;
                if (currentNumber < evenMin) {
                    evenMin = currentNumber;
                }
                if (currentNumber > evenMax) {
                    evenMax = currentNumber;
                }
            }
        }

        // Print results for odd positions
        System.out.println("OddSum=" + oddSum);

        if (oddMin == 1000000000.0) {
            System.out.println("OddMin=No");
        } else {
            System.out.println("OddMin=" + oddMin);
        }

        if (oddMax == -1000000000.0) {
            System.out.println("OddMax=No");
        } else {
            System.out.println("OddMax=" + oddMax);
        }

        // Print results for even positions
        System.out.println("EvenSum=" + evenSum);

        if (evenMin == 1000000000.0) {
            System.out.println("EvenMin=No");
        } else {
            System.out.println("EvenMin=" + evenMin);
        }

        if (evenMax == -1000000000.0) {
            System.out.println("EvenMax=No");
        } else {
            System.out.println("EvenMax=" + evenMax);
        }

    }
}
