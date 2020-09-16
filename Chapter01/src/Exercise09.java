public class Exercise09 {
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

        System.out.print("Birth rate in one year = ");
        System.out.println(((365 * (24 * 3600)) / 7.0));

        System.out.print("Death rate in one year = ");
        System.out.println(((365 * (24 * 3600)) / 13.0));

        System.out.print("Immigrant rate in one year = ");
        System.out.println(((365 * (24 * 3600)) / 45.0));

        System.out.print("Population increase in one year = ");
        System.out.println((4505142.857142857 + 700800.0) - 2425846.153846154);

        System.out.print("Population for the next year = ");
        System.out.println(312032486 + 2780096.7032967033);
    }
}
