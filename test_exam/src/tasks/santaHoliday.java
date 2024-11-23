package tasks;

import java.util.Scanner;

public class santaHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String type_of_room = scanner.nextLine().toLowerCase();
        String evaluation = scanner.nextLine().toLowerCase();

        double pricePerNight = 0;
        double discount = 0;


        if (type_of_room.equals("room for one person")) {
            pricePerNight = 18;
        } else if (type_of_room.equals("apartment")) {
            pricePerNight = 25;
            if (days < 10) {
                discount = 30;
            } else if (days < 15) {
                discount = 35;
            } else {
                discount = 50;
            }

        } else if (type_of_room.equals("president apartment")) {
            pricePerNight = 35;
            if (days < 10) {
                discount = 10;
            } else if (days < 15){
                discount = 15;
            } else {
                discount = 20;
            }
        }

        double totalPrice = pricePerNight * (days - 1);
        double totalDiscount = totalPrice - (totalPrice * discount / 100);

        if (evaluation.equals("positive")) {
            totalDiscount *= 1.25;
        } else {
            totalDiscount *= 0.9;
        }

        System.out.printf("%.2f", totalDiscount);
    }
}
