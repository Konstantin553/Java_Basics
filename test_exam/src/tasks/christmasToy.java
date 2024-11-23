package tasks;

import java.util.Scanner;

public class christmasToy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String firstAndLastRow = strRepeat("-", n * 2 )
                + strRepeat("*", n)
                + strRepeat("-", n * 2 );
        System.out.println(firstAndLastRow);

        String middleRow = strRepeat("-", n / 2)
                + "*"
                + strRepeat("|", n * 4 - 2)
                + "*"
                + strRepeat("-", n / 2);

        for (int i = 0; i < n / 2; i++) {
            String upperLine = strRepeat("-", (n * 2 - 2) - 2 * i)
                    + strRepeat("*", 1 + i)
                    + strRepeat("&", n + 2 + 2 * i)
                    + strRepeat("*", 1 + i)
                    + strRepeat("-", (n * 2 - 2) - 2 * i);

            System.out.print(upperLine);
            System.out.println();
        }

        for (int i = 0; i < n / 2; i++) {
            String middleLine = strRepeat("-", n - 1 - i)
                    + "**"
                    + strRepeat("~", n * 3 - 2 + 2 * i)
                    + "**"
                    + strRepeat("-", n - 1 - i);

            System.out.print(middleLine);
            System.out.println();
        }

        System.out.println(middleRow);

        for (int i = 0; i < n / 2; i++) {
            String downUpperLine = strRepeat("-", n / 2 + i)
                    + "**"
                    + strRepeat("~", n * 4 - 4 - 2 * i)
                    + "**"
                    + strRepeat("-", n / 2 + i);

            System.out.print(downUpperLine);
            System.out.println();
        }

        for (int i = 0; i < n / 2; i++) {
            String downLowerLine = strRepeat("-", n + 2 * i)
                    + strRepeat("*", n / 2 - i)
                    + strRepeat("&", n * 2 - 2 * i)
                    + strRepeat("*", n / 2 - i)
                    +  strRepeat("-", n + 2 * i);

            System.out.print(downLowerLine);
            System.out.println();
        }

        System.out.println(firstAndLastRow);

    }

    static String strRepeat(String strToRepeat, int count){
            String text = "";
            for (int i = 0; i < count; i++) {
                text += strToRepeat;
            }
            return text;
    }
}
