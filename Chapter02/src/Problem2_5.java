import java.util.Scanner;

public class Problem2_5 {
    public static void  main(String[] args){

        /**
         * Financial application: calculate tips
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = scanner.nextDouble();
        double gratuity_rate = scanner.nextDouble();

        double gratuityInDollars = subtotal * (gratuity_rate / 100.0);
        double totalInDollars = gratuityInDollars + subtotal;

        System.out.println("The gratuity is $" + gratuityInDollars + " and total is $" + totalInDollars);
    }
}
