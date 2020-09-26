import java.util.Scanner;

public class Exercise2_04 {
    public static void main (String[] args){

        /**
         * Convert pounds into kilograms
         * One pound is 0.454 kilograms
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pounds = scanner.nextDouble();

        double convertKilo = pounds * 0.454;

        System.out.println(pounds + " pounds is " + convertKilo + " kilograms");
    }
}

