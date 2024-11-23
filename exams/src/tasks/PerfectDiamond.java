package tasks;

import java.util.Scanner;

public class PerfectDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

//        String top = " " + strRepeat("*", 1);
//        System.out.println(top);
//
//        String topUpper = "*" + "_" + "*";
//        System.out.println(topUpper);

        for (int i = 1; i <= n; i++) {
            System.out.print(strRepeat(" ", n - i));
            System.out.print("*");

            for (int j = 0; j < i - 1; j++) {
                System.out.print("-*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1 ; i--) {
            System.out.print(strRepeat(" ", n - i));
            System.out.print("*");

            for (int j = 1; j < i; j++) {
                System.out.print("-*");
            }
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
