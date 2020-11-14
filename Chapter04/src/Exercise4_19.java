import java.util.Scanner;

public class Exercise4_19 {
    public static void main(String[] args){

        // Business: check ISBN-10

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String input = scanner.nextLine();

        int num = Integer.parseInt(input);

        int num9 = num % 10;
        int num8 = num / 10 % 10;
        int num7 = num / 100 % 10;
        int num6 = num / 1000 % 10;
        int num5 = num / 10000 % 10;
        int num4 = num / 100000 % 10;
        int num3 = num / 1000000 % 10;
        int num2 = num / 10000000 % 10;
        int num1 = num / 100000000;

        int checksum = (num1 * 1 + num2 * 2 + num3 * 3 + num4 * 4 + num5 * 5 + num6 * 6 +
                num7 * 7 + num8 * 8 + num9 * 9) % 11;

        if (checksum == 10){
            System.out.printf("The ISBN-10 number is %d%d%d%d%d%d%d%d%dX%n", num1, num2, num3, num4, +
                    num5, num6, num7, num8, num9);
        }
        else{
            System.out.printf("The ISBN-10 number is %d%d%d%d%d%d%d%d%d%d%n", num1, num2, num3, num4, +
                    num5, num6, num7, num8, num9, checksum);
        }
    }
}
