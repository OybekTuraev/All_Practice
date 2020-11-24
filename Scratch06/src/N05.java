import java.util.Scanner;

public class N05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("The GCD for two number is " + gcd(num1, num2));
    }

    public static int gcd(int num1, int num2){
        int gcd = 1;

        for (int k = 2; k <= num1 && k <= num2; k++){
            if (num1 % k == 0 && num2 % k == 0){
                gcd = k;
            }
        }

        return gcd;
    }
}
