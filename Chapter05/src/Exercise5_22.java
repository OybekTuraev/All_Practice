import java.util.Scanner;

public class Exercise5_22 {
    public static void main(String[] args) {

        // Financial application: loan amortization schedule

        Scanner scanner = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loan = scanner.nextDouble();
        System.out.print("Number of Years: ");
        int years = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annual_rate = scanner.nextDouble();

        double monthly_rate = annual_rate / 1200;

        double monthly_payment = (loan * monthly_rate) / (1 - (1 / (Math.pow((1 + monthly_rate), years * 12))));

        double  total_payment = monthly_payment * years * 12;

        System.out.printf("%nMonthly Payment: %.2f%n", monthly_payment);
        System.out.printf("Total Payment: %.2f%n%n", total_payment);

        System.out.println("Payment#    Interest   Principal   Balance");

        double balance = loan;
        double interest, principal;

        for (int i = 1; i <= years * 12; i++){

            interest = monthly_rate * balance;
            principal = monthly_payment - interest;
            balance = balance - principal;
            
            System.out.printf("%-2d", i);
            System.out.printf("%15.2f", interest);
            System.out.printf("%12.2f", principal);
            System.out.printf("%13.2f", balance);
            System.out.println();
        }
    }
}
