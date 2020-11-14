import java.util.Scanner;

public class Exercise4_08 {
    public static void main(String[] args) {

        // Find the character of an ASCII code

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an ASCII code (0;127): ");
        int code = scanner.nextInt();

        char value = (char)(code);
        System.out.printf("The character for ASCII code %d is %c", code, value);
    }
}
