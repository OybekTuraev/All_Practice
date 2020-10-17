import java.util.Scanner;

public class Exercise3_06 {
    public static void main(String[] args){

        /**
         *  Health application: BMI
         */

        final double POUND_IN_KILOGRAM = 0.45359237;
        final double INCHES_IN_METERS = 0.0254;
        final double FEET_IN_INCHES = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter feet: ");
        double feet = scanner.nextDouble();
        System.out.print("Enter inches: ");
        double inches = scanner.nextDouble();

        double kilogram = weight * POUND_IN_KILOGRAM;
        double total_inches = feet * FEET_IN_INCHES + inches;
        double meters = total_inches * INCHES_IN_METERS;

        double bmi = kilogram / (meters * meters);
        System.out.println("BMI is " + bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25.0)
            System.out.println("Normal");
        else if (bmi < 30.0)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
