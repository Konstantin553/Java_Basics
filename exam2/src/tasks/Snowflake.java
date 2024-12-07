package tasks;

import java.util.Scanner;

public class Snowflake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String upperPart = strRepeat(".", i) + "*"
                    + strRepeat(".", n  - i)
                    + "*"
                    + strRepeat(".", n - i)
                    + "*"
                    + strRepeat(".", i);

            if (i == n - 1) {
                upperPart = strRepeat(".", i) + "*"
                        + "*"
                        + "*"
                        + "*"
                        + "*"
                        + strRepeat(".", i);
            }
            
            System.out.print(upperPart);
            System.out.println();
        }

        String middleRow = strRepeat("*", n * 2 + 3);
        System.out.println(middleRow);


        for (int i = 0; i < n; i++) {
            String lowerRow = strRepeat(".", n - i - 1)
                    + "*"
                    + strRepeat(".", i + 1)
                    + "*"
                    + strRepeat(".", i + 1)
                    + "*"
                    + strRepeat(".", n - i - 1);

            if (i == 0) {
                lowerRow = strRepeat(".", n - i - 1)
                        + "*"
                        + "*"
                        + "*"
                        + "*"
                        + "*"
                        + strRepeat(".", n - i - 1);
            }

            System.out.print(lowerRow);
            System.out.println();
        }
        



    }

    static String strRepeat(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
