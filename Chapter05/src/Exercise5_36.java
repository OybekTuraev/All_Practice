import java.util.Scanner;

public class Exercise5_36 {
    public static void main(String[] args) {

        // Business Application Check ISBN
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of the ISBN as integer: ");
        int input = scanner.nextInt();
        int input2 = input;

        int[] numbers = new int[9];
        int d10 = 0;
        int sum = 0;

        for (int i = numbers.length - 1, j = 1; i >= 0; i--, j++){
            numbers[i] = input % 10;
            input /= 10;
        }

        for (int i = 0; i < numbers.length; i++){
            sum += (numbers[i] * (i + 1));
        }

        d10 = sum % 11;

        System.out.println("The ISBN-10 number is " + input2 + ((d10 != 10) ? d10 : "X"));
    }
}
