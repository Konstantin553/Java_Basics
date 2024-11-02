import java.text.DecimalFormat;
import java.util.Scanner;

public class dailyEarnings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        int workDays = Integer.parseInt(scanner.nextLine());
        double dailyEarnings = Double.parseDouble(scanner.nextLine());
        double currencyRate = Double.parseDouble(scanner.nextLine());

        double monthlyEarnings = workDays * dailyEarnings;
        double yearlyEarnings = (monthlyEarnings * 12) + (monthlyEarnings * 2.5);
        double taxes = 0.25 * yearlyEarnings;
        double netSalary = yearlyEarnings - taxes;
        double salaryInLeva = netSalary * currencyRate;
        double average = salaryInLeva / 365;

        System.out.println(decimalFormat.format(average));

    }
}
