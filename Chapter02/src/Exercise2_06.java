import java.util.Scanner;

public class Exercise2_06 {
    public static void main (String[] args){

        /**
         * Sum the digits in an integer
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();

        int num3 = number % 10;               // Extract the digit
        number /= 10;                        // remove extracted digit
        int num2 = number % 10;
        number /= 10;                        // the remaining part of number

        int sum = number + num2 + num3;

        System.out.println("The sum of the digits is " + sum);
    }
}
