package tasks;

import java.util.Scanner;

public class IncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countCurrentLongest = 0;
        int countLongest = 0;
        int aPrev = 0;



        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scanner.nextLine());

            if (a > aPrev) {
                countCurrentLongest++;
            } else {
                countCurrentLongest = 1;
            }
            if (countCurrentLongest > countLongest) {
                countLongest = countCurrentLongest;
            }
            aPrev = a;
        }

        System.out.println(countLongest);
    }
}
