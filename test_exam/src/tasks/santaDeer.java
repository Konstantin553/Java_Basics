package tasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class santaDeer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int days_missing = Integer.parseInt(scanner.nextLine());
        int food_in_kg = Integer.parseInt(scanner.nextLine());
        double first_deer = Double.parseDouble(scanner.nextLine());
        double second_deer = Double.parseDouble(scanner.nextLine());
        double third_deer = Double.parseDouble(scanner.nextLine());

        double total_food = (first_deer + second_deer + third_deer) * days_missing;

        if (total_food <= food_in_kg) {
           double food_left =  Math.floor(food_in_kg - total_food);//закръгля надолу
            System.out.printf("%.0f kilos of food left.", food_left);
        } else{
            double food_needed = Math.ceil(total_food - food_in_kg);//закръгля нагоре
            System.out.printf("%.0f more kilos are needed.", food_needed);
        }





    }
}
