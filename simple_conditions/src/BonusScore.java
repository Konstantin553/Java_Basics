import java.net.Socket;
import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Score = Integer.parseInt(scanner.nextLine());
        double bonusScore = 0;

        if (Score % 2 == 0) {
            bonusScore = 1;
        } else if (Score % 5 == 0) {
            bonusScore = 2;
        }

        if (Score <= 100) {
            bonusScore += 5;
        } else if (Score > 100 && Score < 1000) {
            bonusScore += Score * 0.2;
        } else if (Score > 1000) {
            bonusScore += Score * 0.1;
        }

        System.out.println(bonusScore);
        System.out.println(Score + bonusScore);
    }
}
