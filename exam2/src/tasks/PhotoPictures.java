package tasks;

import java.util.Scanner;

public class PhotoPictures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPhotos = Integer.parseInt(scanner.nextLine());
        String photosType= scanner.nextLine();
        String orderType = scanner.nextLine();

        double priceForOnePhoto = 0;
        double discount = 0;

        if ("9X13".equals(photosType)) {
            if (numberOfPhotos > 50) {
                discount = 0.05;
            }
            priceForOnePhoto = 0.16;
        } else if ("10X15".equals(photosType)) {
            if (numberOfPhotos >= 80) {
                discount = 0.03;
            }
            priceForOnePhoto = 0.16;
        } else if ("13X18".equals(photosType)) {
            if (numberOfPhotos >= 50 && numberOfPhotos <= 100) {
                discount = 0.03;
            } else if (numberOfPhotos > 100) {
                discount = 0.05;
            }
            priceForOnePhoto = 0.38;

        }else if ("20X30".equals(photosType)) {
            if (numberOfPhotos >= 10 && numberOfPhotos <= 50) {
                discount = 0.07;
            } else if (numberOfPhotos > 50) {
                discount = 0.09;
            }
            priceForOnePhoto = 2.90;
        }

        double totalPrice = priceForOnePhoto * numberOfPhotos;
        totalPrice = totalPrice * (1 - discount);

        if ("online".equals(orderType)) {
            discount = 0.02;
            totalPrice = totalPrice * (1 - discount);
        }

        System.out.printf("%.2fBGN", totalPrice);

    }
}
