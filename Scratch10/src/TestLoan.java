import java.util.Scanner;

public class TestLoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter annual interest rate, e.g: 8.25: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of the years: ");
        int years = scanner.nextInt();

        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        Loan loan = new Loan(annualInterestRate, years, loanAmount);

        System.out.printf("The loan was created on %s\n" + "The monthly payment  is %2f\n" +
                "The total payment is %2f\n", loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                loan.getTotalPayment());
    }
}
