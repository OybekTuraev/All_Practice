import java.util.Scanner;

public class Exercise2_01 {
    public static void main (String[] args){

        /**
         * Convert from Celsius  to Fahrenheit
         * Formula ( 9 / 5) * Celsius + 32
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = scan.nextDouble();

        double fahrenheit = (9 / 5.0) * celsius + 32;

        System.out.printf("%.0f Celsius is %.1f Fahrenheit%n", celsius, fahrenheit);

        // System.out.println(temp + " celsius is " + answer + " Fahrenheit");
    }
}
