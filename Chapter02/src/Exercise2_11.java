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

        final int CURRENT_POPULATION = 312_032_486;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int number_years = scanner.nextInt();

        double birth_rate = number_years * ((365 * 24 * 60 * 60) / 7.0);
        double death_rate = number_years * ((365 * 24 * 60 * 60) / 13.0);
        double immigrant_rate = number_years * ((365 * 24 * 60 * 60) / 45.0);

        double population_in_years = CURRENT_POPULATION + (birth_rate + immigrant_rate - death_rate);

        System.out.printf("The population in %d years is %.0f%n", number_years, population_in_years);

        //System.out.println("The population in " + years + " years is " + (int)population_in_five_years);
    }
}
