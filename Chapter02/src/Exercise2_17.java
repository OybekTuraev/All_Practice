import java.util.Scanner;

public class Exercise2_17 {
    public static void main(String[] args){

        /**
         * Science: wind-chill temperature
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double t = scanner.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double v = scanner.nextDouble();

        double v1 = Math.pow(v, 0.16);

        double t_wc = 35.74 + 0.6215 * t - 35.75 * v1 + 0.4275 * t * v1;

        System.out.println("The wwind chill index is " + t_wc);
    }
}
