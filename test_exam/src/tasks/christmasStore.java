package tasks;

import java.util.Scanner;

public class christmasStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        int start1 = (int)firstInput.charAt(0);
        int end1 = (int)secondInput.charAt(0);
        int start2 = (int)firstInput.charAt(1);
        int end2 = (int)secondInput.charAt(1);
        int start3 = (int)firstInput.charAt(2);
        int end3 = (int)secondInput.charAt(2);
        int start4 = (int)firstInput.charAt(3);
        int end4 = (int)secondInput.charAt(3);

        for (int i = start1; i <= end1; i++) {
            for (int j = start2; j <= end2; j++) {
                for (int k = start3; k <= end3; k++) {
                    for (int l = start4; l <= end4; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%c%c%c%c ", (char) (i), (char) j, (char) k, (char) l);
                        }
                    }
                }
            }
        }

    }
}
