import java.util.Scanner;

public class Exercise3_08 {
    public static void main(String[] args){

        /**
         * Sort three integers
         */

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter three integer number: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = Math.max(a, b);
        int max1 = Math.max(max, c);
        int min = Math.min(a, b);
        int min1 = Math.min(min, c);

        System.out.println("Numbers in non-decreasing order: " + min1 + "," + max + "," + max1);
    }
}
