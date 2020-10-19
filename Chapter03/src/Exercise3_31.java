import java.util.Scanner;

public class Exercise3_31 {
    public static void main(String[] args){

        /**
         *  Financials: currency exchange
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int order = scanner.nextInt();

        if (order > 1){
            System.out.println("Incorrect input");
        }

        switch (order){
            case 0:
                System.out.print("Enter the dollar amount: ");
                double dollar = scanner.nextDouble();

                double convert = dollar * rate;

                System.out.printf("$%.2f is %.2f yuan%n", dollar, convert);
                break;

            case 1:
                System.out.print("Enter the RBM amount: ");
                double rbm = scanner.nextDouble();

                double convert1 = rbm / rate;

                System.out.printf("%.2f yuan is $%.2f%n", rbm, convert1);
        }
    }
}
