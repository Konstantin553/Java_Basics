    import java.util.Scanner;

    public class GreaterNumber {
        public static void main(String[] args) {
            System.out.println("Enter two integers: ");
            Scanner scanner = new Scanner(System.in);

            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());

            if (number1 > number2) {
                System.out.println("Greater number is: " + number1);
            } else {
                System.out.println("Greater number is: " + number2);
            }
        }
    }
