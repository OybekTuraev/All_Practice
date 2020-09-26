import java.util.Scanner;

public class Exercise2_13 {
    public static void main(String[] args){

        /**
         * Financial Application
         * Suppose you save $100 each month
         * into a savings account with the annual interest rate 5%.
         * Thus, the monthly inter�est rate is 0.05/12 = 0.00417
         *
         * 100 * (1 + 0.00417) = 100.417
         * After the second month, the value in the account becomes
         * (100 + 100.417) * (1 + 0.00417) = 201.252
         * After the third month, the value in the account becomes
         * (100 + 201.252) * (1 + 0.00417) = 302.507
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double first_amount = scanner.nextDouble();

        final double monthly_rate = 0.00417;

        double first_month = first_amount * (1 + monthly_rate);
        double second_month = (first_amount + first_month) * (1 + monthly_rate);
        double third_month = (first_amount + second_month) * (1 + monthly_rate);
        double fourth_month = (first_amount + third_month) * (1 + monthly_rate);
        double fifth_month = (first_amount + fourth_month) * (1 + monthly_rate);
        double sixth_month = (first_amount + fifth_month) * (1 + monthly_rate);

        System.out.printf("After the sixth month, the account value is %.2f\n", sixth_month);
      // Using "printf" just minimize the numbers after the decimal point, rounding
    }
}
