import java.util.Scanner;

public class Exercise5_14 {
    public static void main(String[] args) {

        // Compute the greatest common divisor

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num2 > num1){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int gcd = 0;

        for (int divisor = num2; divisor > 1; divisor--) {
            if (num1 % divisor == 0 && num2 % divisor == 0){
                gcd = divisor;
                System.out.println("The GCD for " + num1 + " and " + num2 + ": " + gcd);
                break;
            }
        }
    }
}
