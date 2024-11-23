package tasks;

import java.util.Scanner;

public class GenerateRectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int left = -n; left < n; left++) {
            for (int top = -n; top < n; top++) {
                for (int right = left + 1; right <= n ; right++) {
                    for (int bottom = top + 1; bottom <= n ; bottom++) {
                        int area = Math.abs(right - left) * Math.abs(bottom - top);
                        if (area >= m) {
                            System.out.printf("(%d, %d) (%d, %d) -> %d%n", left, right, top, bottom, area);
                            count++;
                        }
                    }
                }
            }
        }

        if (count == 0) {
            System.out.println("No");
        }
    }
}
