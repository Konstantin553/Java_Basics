import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        if (number1 == number2 && number1 == number3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
