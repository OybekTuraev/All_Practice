import java.util.Scanner;

public class Exercise5_16 {
    public static void main(String[] args) {

        // Find the factors of an integer

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int divisor = 2;

        while (num / divisor != 1){

            if (num % divisor == 0) {
                System.out.print(divisor + ",");
                num /= divisor;
            }
            else {
                divisor++; // increase if no longer divided by the previous number
            }
        }
        System.out.print(num + "\n"); // the last number after division
    }
}
