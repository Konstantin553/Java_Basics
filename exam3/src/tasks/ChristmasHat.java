package tasks;

import java.util.Scanner;

public class ChristmasHat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String topRow1 = strRepeat(".", n * 2 - 1)
                + "/"
                + "|"
                + "\\"
                + strRepeat(".", n * 2 - 1);

        String topRow2 = strRepeat(".", n * 2 - 1)
                + "\\"
                + "|"
                + "/"
                + strRepeat(".", n * 2 - 1);
        System.out.println(topRow1);
        System.out.println(topRow2);

        String topLastRow = strRepeat(".", n * 2 - 1)
                + "*"
                + "*"
                + "*"
                + strRepeat(".", n * 2 - 1);
        System.out.println(topLastRow);

        for (int i = 1; i < n * 2; i++) {
            String middleRow = strRepeat(".", n * 2 - 1 - i)
                    + "*"
                    + strRepeat("_", i)
                    + "*"
                    + strRepeat("_", i)
                    + "*"
                    + strRepeat(".", n * 2 - 1 - i);
            System.out.println(middleRow);

        }

        String lowMiddleRow = strRepeat("*", n * 4 + 1);
        System.out.println(lowMiddleRow);

        String lowerRow = strRepeat("*.", n * 2)
                + "*";
        System.out.println(lowerRow);

        String bottomRow = strRepeat("*", n * 4 + 1);
        System.out.println(bottomRow);
    }

    static String strRepeat(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
