import java.util.Scanner;

public class Exercise5_30 {
    public static void main(String[] args) {

        // Financial Application: compound value

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double annual_rate = scanner.nextDouble();
        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        double monthly_rate = annual_rate / 1200;

        double comp_value = 0;

        for (int i = 1; i <= months; i++) {
            comp_value = (amount + comp_value) * (1 + monthly_rate);
        }

        System.out.printf("Savings after " +
                        months + " months: $%.2f%n", comp_value);
    }
}
