import java.util.Scanner;

public class Exercise5_32 {
    public static void main(String[] args) {

        // Revise Lottery

        int l_digit1 = (int)(Math.random() * 10);
        int l_digit2;

        do {
            l_digit2 = (int)(Math.random() * 10);

        } while (l_digit2 == l_digit1);


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the two-digit number to check your luck: ");
        int guess = scan.nextInt();

        // Get the digits from guess
        int guess_digit1 = guess / 10;              // the first one
        int guess_digit2 = guess % 10;             // the last one

        System.out.println("The lottery number is " + l_digit1 + "" + l_digit2);

        // Check the guess

        if (guess_digit1 == l_digit1 && guess_digit2 == l_digit2){
            System.out.println("Exact match: you win $10,000");
        }
        else if (guess_digit1 == l_digit2 && guess_digit2 == l_digit1){
            System.out.println("All digits match: you win $3,000");
        }
        else if (guess_digit1 == l_digit1 || guess_digit1 == l_digit2 ||
                guess_digit2 == l_digit1 || guess_digit2 == l_digit2 ){
            System.out.println("Match one digit: you win $1,000");
        }
        else {
            System.out.println("Sorry, no match");
        }
    }
}
