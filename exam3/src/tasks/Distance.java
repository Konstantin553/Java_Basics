package tasks;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialSpeed = Integer.parseInt(scanner.nextLine());
        int firstInterval = Integer.parseInt(scanner.nextLine());
        int secondInterval = Integer.parseInt(scanner.nextLine());
        int thirdInterval = Integer.parseInt(scanner.nextLine());

        double minutesPerHour = 60;

        double firstIntervalHours = firstInterval / minutesPerHour;
        double firstDistance = initialSpeed * firstIntervalHours;

        double speedAfterIncrease = initialSpeed + ((double) (initialSpeed * 10) / 100);

        double secondIntervalHours = secondInterval / minutesPerHour;
        double secondDistance = speedAfterIncrease * secondIntervalHours;

        double speedAfterDecrease = speedAfterIncrease - ((speedAfterIncrease * 5) / 100);

        double thirdIntervalHours = thirdInterval / minutesPerHour;
        double thirdDistance = speedAfterDecrease * thirdIntervalHours;

        double finalDistance = firstDistance + secondDistance + thirdDistance;

        System.out.printf("%.2f", finalDistance);


    }
}
