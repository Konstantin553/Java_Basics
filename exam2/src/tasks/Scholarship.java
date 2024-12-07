package tasks;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageScore = Double.parseDouble(scanner.nextLine());
        double minimumWage = Double.parseDouble(scanner.nextLine());

        int socialScholarship = -1;
        int excellentResultsScholarship = -1;

        if (income < minimumWage && averageScore >= 4.50) {
              socialScholarship =(int) (minimumWage * 0.35);
        }

        if (averageScore >= 5.50) {
            excellentResultsScholarship = (int) (averageScore * 25);
        }

        if (excellentResultsScholarship == -1 && socialScholarship == -1) {
            System.out.println("You cannot get a scholarship!");
        } else {
            if (socialScholarship > excellentResultsScholarship) {
                System.out.printf("You get a Social Scholarship %s BGN\n", socialScholarship);
            } else {
                System.out.printf("You get a scholarship for excellent results %s BGN\n", excellentResultsScholarship);
            }
        }

    }
}
