import java.util.Scanner;

public class University_Room {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        int columns = (int) ((width - 100) / 70);
        int rows = (int) (length / 120);
        int workplace = (rows * columns) - 3;

        System.out.println(workplace);
    }
}
