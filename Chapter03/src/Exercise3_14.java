import java.util.Random;
import java.util.Scanner;

public class Exercise3_14 {
    public static void main(String[] args){

        /**
         * Game: heads or tails
         */

        Random generator = new Random();

        int random_num = generator.nextInt(2);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 0 for head and 1 for tail for the flip of the coin: ");
        int guess = scanner.nextInt();

        if (guess == 0 || guess == 1){     // check not other values
            if (random_num == guess){
                System.out.println("Correct");
            }
            else{
                System.out.println("Incorrect");
            }
        }
        else {
            System.out.println("Invalid value");
        }
    }
}
