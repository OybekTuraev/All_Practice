public class Exercise10 {
    public static void main(String[] args) {

        /**
         * Assume a runner runs 24 miles in 1 hour, 40 minutes,
         * and 35 seconds. Write a program that displays the average speed in kilometers per
         * hour. (Note that 1 mile is 1.6 kilometers.)
         */

        // 1-miles to km
        // 2- all to seconds and then to hour
        // 3- V = S / t = km/h

        // Updated Version


       /* System.out.println((24 * 1.6) / ((3600 + 2400 + 35) / 3600.0));*/
        double solution = 24 * 1.6 / ((3600 + 2400 +35) / 3600.0);
        System.out.print("Average Speed = " + solution);



    }
}
