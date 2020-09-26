import java.util.Scanner;

public class Exercise2_21 {
    public static void main(String[] args){

        /**
         *  Financial application: calculate future investment value
         *  futureInvestmentValue =
         *  investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
         *
         *  Trick  here, need to find monthly interest rate
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double invest_amount = scanner.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double interest_rate = scanner.nextDouble();
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double monthly_rate = interest_rate / 1200;
        double future_value = invest_amount * Math.pow(1 + monthly_rate, years * 12);

        System.out.printf("Accumulated value is $%.2f\n", future_value);
    }
}
