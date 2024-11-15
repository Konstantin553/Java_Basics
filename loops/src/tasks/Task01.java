package tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the count of numbers
        int n = scanner.nextInt();

        int sum = 0;
        int maxElement = Integer.MIN_VALUE;
        int currentNumber;

        // Process each number
        for (int i = 1; i <= n; i++) {
            currentNumber = scanner.nextInt();

            sum += currentNumber; // Add current number to total sum

            // Check if the current number is the largest
            if (currentNumber > maxElement) {
                maxElement = currentNumber;
            }
        }

        // Calculate the sum of all other elements except the largest
        int sumOfRest = sum - maxElement;

        // Output based on condition
        if (maxElement == sumOfRest) {
            System.out.println("Yes Sum = " + maxElement);
        } else {
            int diff = Math.abs(maxElement - sumOfRest);
            System.out.println("No Diff = " + diff);
        }


    }
}
