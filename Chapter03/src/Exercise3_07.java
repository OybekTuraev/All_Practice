import java.util.Scanner;

public class Exercise3_07 {
    public static void main(String[] args){

        /**
         * Financial application: monetary units
         */
        final int DOLLAR_in_CENTS = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double dollar = scanner.nextDouble();

        int cents = (int)(dollar * DOLLAR_in_CENTS);

        int num_dollars = cents / 100;
        int quarters = cents % 100 / 25;
        int dimes = cents % 100 % 25 / 10;
        int nickels = cents % 100 % 25 % 10 / 5;
        int pennies = cents % 100 % 25 % 10 % 5;

        System.out.println("Your money " + dollar + " consists of: ");
        System.out.println(num_dollars + ((num_dollars == 1) ? " dollar" : " dollars"));
        System.out.println(quarters + ((quarters == 1) ? " quarter" : " quarters"));
        System.out.println(dimes + ((dimes == 1) ? " dime" : " dimes"));
        System.out.println(nickels + ((nickels == 1) ? " nickle" : " nickels"));
        System.out.println(pennies + ((pennies == 1) ? " penny" : " pennies"));
    }
}
