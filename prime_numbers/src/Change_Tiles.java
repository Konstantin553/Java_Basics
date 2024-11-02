import java.util.Scanner;

public class Change_Tiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int site = Integer.parseInt(scanner.nextLine());
        double width_tile = Double.parseDouble(scanner.nextLine());
        double length_tile = Double.parseDouble(scanner.nextLine());
        int width_bench = Integer.parseInt(scanner.nextLine());
        int length_bench = Integer.parseInt(scanner.nextLine());

        int site_area = site * site;
        double tile_area = width_tile * length_tile;
        int bench_area = width_bench * length_bench;

        int area = site_area - bench_area;
        double tile_count = area / tile_area;
        double time = tile_count * 0.2;

        System.out.println(tile_count);
        System.out.println(time);
    }
}
