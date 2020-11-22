import java.util.Scanner;

public class Exercise5_21 {
    public static void main(String[] args) {

        // Financial Application: compare loans with various interest rates

        Scanner scanner = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loan = scanner.nextDouble();

        System.out.print("Number of Years: ");
        int years = scanner.nextInt();

        System.out.println("Interest Rate    Monthly Payment    Total Payment");

        for (double rate = 5.0; rate <= 8.0; rate += 1 / 8.0){

            double monthly_rate = rate / 1200;

            double monthly_payment = (loan * monthly_rate) / (1 - (1 / (Math.pow((1 + monthly_rate), years * 12))));

            double  total_payment = monthly_payment * years * 12;

            System.out.printf("%.3f%%", rate);
            System.out.printf("%17.2f", monthly_payment);
            System.out.printf("%21.2f", total_payment);
            System.out.println();
        }
    }
}
