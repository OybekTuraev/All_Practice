import java.util.Scanner;

public class Exercise3_33 {
    public static void main(String[] args) {

        /**
         * Financial: compare costs
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double weight1 = scanner.nextDouble();
        double price1 = scanner.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = scanner.nextDouble();
        double price2 = scanner.nextDouble();

        // the weight and price ratio should be the same for the same cost
        if (weight1 / weight2 == price1 / price2){
            System.out.println("Two packages have the same price.");
        }
        // if price ratio is bigger then package is a bit expensive
        else if (weight1 / weight2 < price1 / price2){
            System.out.println("Package 2 has a better price.");
        }
        else{
            System.out.println("Package 1 has a better price.");
        }
    }
}
