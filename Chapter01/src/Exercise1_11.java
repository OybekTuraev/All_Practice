public class Exercise1_11 {
    public static void main(String[] args) {

        /**
         * Population Projection
         *  ■ One birth every 7 seconds
         *  ■ One death every 13 seconds
         *  ■ One new immigrant every 45 seconds
         *  current population is 312,032,486
         *  Write a program to display the population for each of the next five years
         */

        // Find the rate of all three in one year / just calculate the seconds for one year and divide
        // To find five years population for each one, just need to multiply by 5,
        // now I am using tha basic way to solve but I will find some smarter way for that later

        // Updated Version


        /*System.out.println(((365 * (24 * 3600)) / 7.0));*/
        double birthRate = 5 * ((365 * 24 * 3600) / 7.0);
        System.out.println("Birth rate in five years = " + birthRate);

        /*System.out.println(((365 * (24 * 3600)) / 13.0));*/
        double deathRate = 5 * ((365 * 24 * 3600) / 13.0);
        System.out.println("Death rate in five years = " + deathRate);

        /*System.out.println(((365 * (24 * 3600)) / 45.0));*/
        double imgRate = 5 * ((365* 24 * 3600) / 45.0);
        System.out.println("Immigrant rate in five years = " + imgRate);

        /*System.out.println((4505142.857142857 + 700800.0) - 2425846.153846154);*/
        double change = 312_032_486 + (birthRate + imgRate - deathRate);
        System.out.println("Total Population with the increase in five years = " + change);
    }
}
