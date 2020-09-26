import java.util.Scanner;

public class Exercise2_22 {
    public static void main(String[] args){

        /**
         * Rewrite Listing 2_10, which is ComputeChange with
         *  int value to improve accuracy
         *
         *  Always obtain remaining cents (by % remainder) after / $, quarters,dimes,nickels.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount in an integer ,cents e.g 1156: ");
        int cents = scanner.nextInt();

        int first_amount = cents;

        int dollars = cents / 100;
        cents %= 100;
        int quarters = cents / 25;
        cents %= 25;
        int dimes = cents / 10;
        cents %= 10;
        int nickels = cents / 5;
        cents %= 5;

        System.out.println(first_amount + " cents consist of ");
        System.out.println(dollars + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(cents + " pennies");
    }
}
