import java.util.Random;
import java.util.Scanner;

public class Exercise3_14 {
    public static void main(String[] args){

        /**
         * Game: heads or tails
         */

        Random generator = new Random();

        int gen_number = generator.nextInt(2);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 0 for head and 1 for tail for the flip of the coin: ");
        int guess = scanner.nextInt();

        System.out.println((guess == gen_number) ? "Correct" : "Incorrect");
    }
}
