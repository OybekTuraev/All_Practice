import java.util.Scanner;

public class Exercise2_11 {
    public static void main(String[] args){

        /**
         * Population Projection
         *  ■ One birth every 7 seconds
         *  ■ One death every 13 seconds
         *  ■ One new immigrant every 45 seconds
         *  current population is 312,032,486
         *  Write a program to display the population for each of the next five years
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        int current_population = 312_032_486;

        double birth_rate = years * ((365 * 24 * 60 * 60) / 7.0);
        double death_rate = years * ((365 * 24 * 60 * 60) / 13.0);
        double immigrant_rate = years * ((365 * 24 * 60 * 60) / 45.0);

        double population_in_five_years = current_population + (birth_rate + immigrant_rate - death_rate);

        System.out.println("The population in " + years + " years is " + (int)population_in_five_years);
    }
}
