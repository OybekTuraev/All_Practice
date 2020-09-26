import java.util.Scanner;

public class Exercise2_20 {
    public static void main(String[] args){

        /**
         * Financial application: calculate interest
         * interest = balance * (annualInterestRate/1200)
         * displays the interest for the next month
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = scanner.nextDouble();
        double interest_rate = scanner.nextDouble();

        double interest = balance * (interest_rate / 1200);

        System.out.println("The interest is " + interest);
    }
}
