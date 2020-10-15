import java.util.Scanner;

public class Exercise2_04 {
    public static void main (String[] args){

        /**
         * Convert pounds into kilograms
         * One pound is 0.454 kilograms
         */

        final double POUND_IN_KILO = 0.454;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pounds = scanner.nextDouble();

        double in_kilo = pounds * POUND_IN_KILO;

        System.out.println(pounds + " pounds is " + in_kilo + " kilograms");
    }
}

