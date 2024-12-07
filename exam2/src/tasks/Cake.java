package tasks;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeLength = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int cakeArea = cakeLength * cakeWidth;

        while (!"STOP".equals(command)){
            int cakePieces = Integer.parseInt(command);
            cakeArea -= cakePieces;

            if (cakeArea < 0) {
                int neededPieces = Math.abs(cakeArea);
                System.out.printf("No more cake left! You need %d pieces more.\n", neededPieces);
                break;
            }

            command = scanner.nextLine();
        }

        if (cakeArea > 0) {
            System.out.printf("%d pieces are left. \n", cakeArea);
        }


    }
}
