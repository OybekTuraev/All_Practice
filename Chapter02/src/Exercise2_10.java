import java.util.Scanner;

public class Exercise2_10 {
    public static void main(String[] args){

        /**
         * Science: calculating energy
         * Formula Q = M * (finalTemperature – initialTemperature) * 4184
         * M = the weight of water
         * Q = Energy in Joules
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double tempFirst = scanner.nextDouble();
        System.out.print("Enter the final temperature: ");
        double tempFinal = scanner.nextDouble();

        double energy = weight * (tempFinal - tempFirst) * 4184;

        System.out.println("The energy needed is " + energy);
    }
}
