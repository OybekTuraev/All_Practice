import java.util.Scanner;

public class Exercise2_14 {
    public static void main(String[] args){

        /**
         * Health application: computing BMI) Body Mass Index (BMI)
         * is a measure of health on weight
         * your weight in kilograms and dividing by the square of your height in meters.
         *
         * one pound is 0.45359237 kilograms and one inch is 0.0254 meters
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble();

        final double pound_in_kilogram = 0.45359237;
        final double inch_in_meter = 0.0254;

        double convert_to_kilo = weight * pound_in_kilogram;
        double convert_to_meter = height * inch_in_meter;

        double bmi = convert_to_kilo / (convert_to_meter * convert_to_meter);

        System.out.printf("BMI is %.4f\n", bmi);
    }
}
