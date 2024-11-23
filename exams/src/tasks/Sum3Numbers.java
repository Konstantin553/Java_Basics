package tasks;

import java.util.Scanner;

public class Sum3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        if (number1 + number3 == number2) {
            System.out.printf("%s + %s = %s", number1, number3, number2);
        } else if (number1 + number2 == number3) {
            System.out.printf("%s + %s = %s", number1, number2, number3);
        } else if (number2 + number3 == number1) {
            System.out.printf("%s + %s = %s", number2, number3, number1);
        } else {
            System.out.println("No");
        }
    }
}
