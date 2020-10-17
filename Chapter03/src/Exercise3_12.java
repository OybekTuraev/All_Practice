import java.util.Scanner;

public class Exercise3_12 {
    public static void main(String[] args){

        /**
         * Palindrome number
         * if it reads the same from right to left and from left to right
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int num = scanner.nextInt();

        int digit1 = num / 100;
        int digit3 = num % 10;

        if (digit1 == digit3){
            System.out.println(num + " is a palindrome");
        }
        else{
            System.out.println(num + " is not a palindrome");
        }
    }
}
