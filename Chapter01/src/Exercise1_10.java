public class Exercise1_10 {
    public static void main(String[] args) {

        /**
         * Assume a runner runs 14 kilometers in 45 minutes and 30
         * seconds. Write a program that displays the average speed in miles per hour. (Note
         * that 1 mile is 1.6 kilometers.)
         */

        // 1- km to mile--"S"
        // 2- minutes to seconds and seconds to hour--"t"
        // 3 - V = S / t

        // Updated Version

        /*System.out.println((14.0 / 1.6) / (((45.0 * 60.0) + 30.0) / 3600));*/
        double solution = (14.0 / 1.6) / ((45.0 * 60.0 + 30.0) / 3600);
        System.out.print("Average Speed = " + solution);
    }

}
