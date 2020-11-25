import java.util.Scanner;

public class Exercise6_07 {
    public static void main(String[] args) {

        /**
         *  Financial application: calculate future investment value
         *  futureInvestmentValue =
         *  investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double value = scanner.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualRate = scanner.nextDouble();

        showTable(value, annualRate, 30);
    }

    public static void showTable(double invest, double annualRate, int years){

        System.out.println("Years        Future Value");

        for (int i = 1; i <= 30; i++){

            double futureInvestment = 0;
            futureInvestment = invest * (Math.pow(1 + monthlyInterestRate(annualRate), i * 12));
            System.out.printf("%2d%20.2f", i, futureInvestment);
            System.out.println();
        }

    }

    public static double monthlyInterestRate(double annualRate){
        return annualRate / 1200;
    }
}
