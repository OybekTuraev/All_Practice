import java.util.Scanner;

public class Exercise6_04 {
    public static void main(String[] args) {

        // Display an integer reversed

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        reverse(num);
    }

    public static void reverse(int n){

        String reverse = "";

        while (n != 0){

            int digit = n % 10;
            reverse += digit;
            n /= 10;
        }

        System.out.println("Its reverse is " + Integer.parseInt(reverse));
    }
}
