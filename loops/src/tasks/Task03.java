package tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of pairs
        int n = scanner.nextInt();

        int previousPairSum = 0;
        int maxDiff = 0;
        int currentPairSum;
        int consistentValue = Integer.MIN_VALUE;  // Placeholder for first pair value

        // Loop to process each pair
        for (int i = 1; i <= n; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            currentPairSum = num1 + num2;

            if (i == 1) {
                // For the first pair, set the consistent value and previousPairSum
                consistentValue = currentPairSum;
            } else {
                // Calculate the difference with the previous pair sum
                int diff = Math.abs(currentPairSum - previousPairSum);
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }

            // Update previousPairSum for the next iteration
            previousPairSum = currentPairSum;
        }

        // After processing all pairs, check if all sums were equal
        if (consistentValue == previousPairSum) {
            System.out.println("Yes, value=" + consistentValue);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}
