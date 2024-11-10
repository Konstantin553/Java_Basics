import java.util.Scanner;

public class FruitOrVeggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();

        boolean isFruits = product.equals("banana") ||
                product.equals("apple") ||
                product.equals("kiwi") ||
                product.equals("cherry") ||
                product.equals("lemon") ||
                product.equals("grapes");

        boolean isVeggies = product.equals("tomato") ||
                product.equals("cucumber") ||
                product.equals("pepper") ||
                product.equals("carrot");

        if (isFruits) {
            System.out.println("fruit");
        } else if (isVeggies) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
