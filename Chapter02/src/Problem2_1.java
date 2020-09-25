import java.util.Scanner;

public class Problem2_1 {
    public static void main (String[] args){

        /**
         * Convert from Celsius  to Fahrenheit
         * Formula ( 9 / 5) * Celsius + 32
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double temp = scan.nextDouble();

        double answer = (9 / 5.0) * temp + 32;

        System.out.println(temp + " celsius is " + answer + " Fahrenheit");
    }
}
