package tasks;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        double numberOfFailedStudents = 0;
        double numberOfAverageStudents = 0;
        double numberOfGoodStudents = 0;
        double numberOfExcellentStudents = 0;
        double totalResult = 0;


        for (int i = 0; i < numberOfStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            totalResult += grade;

            if (grade < 3) {
                numberOfFailedStudents++;
            } else if (grade < 4) {
                numberOfAverageStudents++;
            } else if (grade < 5) {
                numberOfGoodStudents++;
            } else if (grade >= 5.50) {
                numberOfExcellentStudents++;
            }

        }

        double failedStudentsPercent = numberOfFailedStudents * 100 / numberOfStudents;
        double averageStudentsPercent = numberOfAverageStudents * 100 / numberOfStudents;
        double goodStudentsPercent = numberOfGoodStudents * 100 / numberOfStudents;
        double excellentStudentsPercent = numberOfExcellentStudents * 100 / numberOfStudents;

        double average = totalResult / numberOfStudents;

        System.out.printf("Top students %.2f", excellentStudentsPercent);
        System.out.println();
        System.out.printf("Between 4.00 and 4.99: %.2f", goodStudentsPercent);
        System.out.println();
        System.out.printf("Between 3.00 and 3.99: %.2f", averageStudentsPercent);
        System.out.println();
        System.out.printf("Fail: %.2f ", failedStudentsPercent);
        System.out.println();
        System.out.printf("Average: %.2f", average);


    }
}
