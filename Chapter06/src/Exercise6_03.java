import java.util.Scanner;

public class Exercise6_03 {
    public static void main(String[] args) {

        // Palindrome integer

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        isPalindrome(num);
    }

    public static void isPalindrome(int n){
        if (reverse(n) == n){
            System.out.println("Yes. The number is a palindrome");
        }
        else {
            System.out.println("No. The number is not a palindrome");
        }
    }

    public static int reverse(int number){

        String reverse = "";

        while (number != 0){

            int digit = number % 10;
            reverse += digit;
            number /= 10;
        }

        return Integer.parseInt(reverse);
    }
}
