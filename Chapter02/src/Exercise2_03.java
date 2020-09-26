import java.util.Scanner;

public class Exercise2_03 {
    public static void main (String[] args){

        /**
         * Convert feet into meters
         * One foot is 0.305 meter
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = scan.nextDouble();

        double convertMeters = feet * 0.305;

        System.out.println(feet + " feet is " + convertMeters + " meters");
    }
}
