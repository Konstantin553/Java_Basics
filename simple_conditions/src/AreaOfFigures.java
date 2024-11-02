import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            double area = side * side;
            System.out.println(area);
        } else if (figure.equals("rectangle")) {
            double width = Double.parseDouble(scanner.nextLine());
            double length = Double.parseDouble(scanner.nextLine());
            double area = width * length;
            System.out.println(area);
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * (radius * radius);
            System.out.println(area);
        } else if (figure.equals("triangle")) {
            double height = Double.parseDouble(scanner.nextLine());
            double side = Double.parseDouble(scanner.nextLine());
            double area = (height * side) / 2;
            System.out.println(area);
        }
    }
}
