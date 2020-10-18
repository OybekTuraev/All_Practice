import java.util.Scanner;

public class Exercise3_20 {
    public static void main(String[] args){

        /**
         * Science: wind-chill temperature
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit : ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double wind = scanner.nextDouble();

        double wind1 = Math.pow(wind, 0.16);

        double index_formula = 35.74 + 0.6215 * temperature - 35.75 * wind1 + 0.4275 * temperature * wind1;

        if ((temperature > -58 && temperature < 41) && wind >= 2){
            System.out.printf("The wind chill index is %.2f%n", index_formula);
        }
        else{
            System.out.println("the temperature and/or wind speed is invalid.");
        }
    }
}
