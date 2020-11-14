import java.util.Scanner;

public class Exercise4_26 {
    public static void main(String[] args){

        // Financial application: monetary units

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount, for example 11.56: ");
        String input = scanner.nextLine();

        int k = input.indexOf(".");
        int dollars = Integer.parseInt(input.substring(0, k));
        int cents = Integer.parseInt(input.substring(k + 1));

        int quarters = cents / 25;
        cents %= 25;
        int dimes = cents / 10;
        cents %= 10;
        int nickels = cents / 5;
        cents %= 5;

        System.out.printf("Your amount %s consists of%n" +
                "        %d dollars%n" +
                "        %d quarters%n" +
                "        %d dimes%n" +
                "        %d nickels%n" +
                "        %d pennies%n", input, dollars, quarters, dimes, nickels, cents);
    }
}
