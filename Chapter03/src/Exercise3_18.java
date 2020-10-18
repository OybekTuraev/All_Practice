import java.util.Scanner;

public class Exercise3_18 {
    public static void main(String[] args){

        /**
         *  Cost of shipping
         */

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the weight of the package (in pounds): ");
        double weight = scanner.nextDouble();

        if (weight > 50){
            System.out.println("The package cannot be shipped");
        }
        else {
            if (weight > 0 && weight <= 1){
                System.out.println("Cost is 3.5 (in dollar)");
            }
            else if (weight > 1 && weight <= 3){
                System.out.println("Cost is 5.5 (in dollar)");
            }
            else if (weight > 3 && weight <= 10){
                System.out.println("Cost is 8.5 (in dollar)");
            }
            else if (weight > 10 && weight <= 20)
                System.out.println("Cost is 10.5 (in dollar)");
            else if (weight > 20 && weight <= 50)
                System.out.println("Not given");
        }
    }
}
