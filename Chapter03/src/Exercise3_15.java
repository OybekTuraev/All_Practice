import java.util.Scanner;

public class Exercise3_15 {
    public static void main(String[] args){
        /**
         *    Computing Lottery for three-digit number
         */

        // Generate the random lottery number
        int lottery = (int)(Math.random() * 1000);

        // Prompt the user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the three-digit number to check your luck: ");
        int guess = scan.nextInt();

        // Get the digits from lottery
        int lottery_digit1 = lottery / 100;        // the first one
        int lottery_digit2 = lottery / 10 % 10;    // the second one
        int lottery_digit3 = lottery % 10;         // the last one

        // Get the digits from guess
        int guess_digit1 = guess / 100;            // the first one
        int guess_digit2 = guess / 10 % 10;        // the second one
        int guess_digit3 = guess % 10;             // the last one

        System.out.println("The lottery number is " + lottery);

        // Check the guess

        if (guess == lottery){
            System.out.println("Exact match: you win $10,000");
        }
        else if (guess_digit3 == lottery_digit1 && guess_digit2 == lottery_digit2 &&
                guess_digit1 == lottery_digit3){
            System.out.println("All digits match: you win $3,000");
        }
        else if (guess_digit1 == lottery_digit1 || guess_digit1 == lottery_digit2 || guess_digit1 == lottery_digit3
                || guess_digit2 == lottery_digit1 || guess_digit2 == lottery_digit2 || guess_digit2 == lottery_digit3
                || guess_digit3 == lottery_digit1 || guess_digit3 == lottery_digit2 || guess_digit3 ==lottery_digit3){
            System.out.println("Match one digit: you win $1,000");
        }
        else {
            System.out.println("Sorry, no match");
        }
    }
}
