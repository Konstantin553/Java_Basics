package tasks;

import java.util.Scanner;

public class Bricks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bricks_amount_x = Integer.parseInt(scanner.nextLine());
        int workers_amount_w = Integer.parseInt(scanner.nextLine());
        int capacity_m = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil((double)bricks_amount_x / capacity_m / workers_amount_w);

        System.out.println(courses);
    }
}
