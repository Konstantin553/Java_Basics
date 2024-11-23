package tasks;

import java.util.Scanner;

public class RectangleWithStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int numRows = n;

        String topAndBottomRow = strRepeat("%", n * 2);
        System.out.println(topAndBottomRow);

        if (numRows % 2 == 0) {
            numRows--;
        }

        for (int i = 0; i < numRows; i++) {
            System.out.print("%");
            if (i == numRows / 2) {
                System.out.print(strRepeat(" ", n - 2));
                System.out.print("**");
                System.out.print(strRepeat(" ", n - 2));
            } else {
                System.out.print(strRepeat(" ", n * 2 - 2));
            }
            System.out.print("%");
            System.out.println();
        }


        System.out.println(topAndBottomRow);

    }
    static String strRepeat(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
