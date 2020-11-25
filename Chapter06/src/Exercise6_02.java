import java.util.Scanner;

public class Exercise6_02 {
    public static void main(String[] args) {

        // Sum the digits in an integer

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the integer: ");
        int num = scanner.nextInt();

        sumDigits(num);
    }

    public static void sumDigits(long n){

        int sumDigits = 0;

        while (n != 0){
            sumDigits += n % 10;
            n /= 10;
        }

        System.out.println(sumDigits);
    }
}
