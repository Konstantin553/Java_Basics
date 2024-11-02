import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double veggies_price = Double.parseDouble(scanner.nextLine());
        double fruits_price = Double.parseDouble(scanner.nextLine());
        int all_veggies = Integer.parseInt(scanner.nextLine());
        int all_fruits = Integer.parseInt(scanner.nextLine());

        double  veggie_revenue = veggies_price * all_veggies;
        double  fruits_revenue = fruits_price * all_fruits;

        double revenue = (veggie_revenue + fruits_revenue) / 1.94;

        System.out.println(revenue);

    }
}
