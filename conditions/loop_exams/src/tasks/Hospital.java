package tasks;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = scanner.nextInt();
        int treatedPatients = 0;
        int untreatedPatients = 0;
        int countOfDoctors = 7;

        for (int day = 0; day <= period; day++) {
            int currentPatiens = scanner.nextInt();

            if ((day % 3 == 0 ) && (untreatedPatients > treatedPatients)) {
                countOfDoctors++;
            }
            if (currentPatiens > countOfDoctors) {
                treatedPatients += countOfDoctors;
                untreatedPatients += currentPatiens - countOfDoctors;
            } else {
                treatedPatients += currentPatiens;
            }
        }

        System.out.println("Treated patients: " + treatedPatients);
        System.out.println("Untreated patients: " + untreatedPatients);
    }
}
