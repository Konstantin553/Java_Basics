import java.util.Scanner;

public class RectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        if ((x == x1 || x == x2) && (y <= y2 && y >= y1)) {
            System.out.println("Border");
        } else if ((y == y1 || y == y2) && (x <= x2 && x >= x1)) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }

    }
}
