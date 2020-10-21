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

        int max = 0;
        int max1 = 0;
        int min = 0;

        if (a >= b && a >= c){
            max = a;
            max1 = Math.max(b, c);
            min = Math.min(b, c);
        }

        if (b >= a && b >= c){
            max = b;
            max1 = Math.max(a, c);
            min = Math.min(a, c);
        }

        if (c >= a && c >= b){
            max = c;
            max1 = Math.max(a, b);
            min = Math.min(a, b);
        }

        System.out.println("Numbers in non-decreasing order: " + min + " " + max1 + " " + max);
    }
}
