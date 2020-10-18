import java.util.Scanner;

public class Exercise3_26 {
    public static void main(String[] args){

        /**
         *   Use the &&, || and ^ operators
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        boolean and = (num % 5 == 0 && num % 6 == 0);
        boolean or = (num % 5 == 0 || num % 6 == 0);
        boolean xor = (num % 5 == 0 ^ num % 6 == 0);

        // %b for boolean value
        System.out.printf("Is %d divisible by 5 and 6? %b%n", num, and);
        System.out.printf("Is %d divisible by 5 or 6? %b%n", num, or);
        System.out.printf("Is %d divisible by 5 or 6? but not both? %b%n", num, xor);
    }
}
