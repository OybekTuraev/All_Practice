import java.util.Scanner;

public class Exercise3_02 {
    public static void main(String[] args){

        /**
         * Game: add three numbers
         */

        int num1 = (int)(System.currentTimeMillis() % 10);
        int num2 = (int)(System.currentTimeMillis() / 3 % 10);
        int num3 = (int)(System.currentTimeMillis() / 8 % 10);

        int sum = num1 + num2 + num3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the sum of " + num1 + " + " + num2 + " + " + num3 + "? ");
        int answer = scanner.nextInt();

        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + answer + " is " + (answer == sum));
    }
}
