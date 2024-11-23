package tasks;

import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());

        int a = Math.abs(x2 - x3);
        int h = Math.abs(y2 - y1);

        double area = (double)a * h / 2;

        System.out.println(area);

    }
}
