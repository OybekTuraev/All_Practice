import java.util.Scanner;

public class Exercise2_23 {
    public static void main(String[] args){

        /**
         * Cost of driving,   the distance to drive
         *  miles per gallon, and the price per gallon
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = scanner.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double miles_per_gallon = scanner.nextDouble();
        System.out.print("Enter price per gallon: ");
        double gallon_price = scanner.nextDouble();

        double total_cost = gallon_price * (distance / miles_per_gallon);

        System.out.printf("the cost of driving is $%.2f\n", total_cost);
    }
}
