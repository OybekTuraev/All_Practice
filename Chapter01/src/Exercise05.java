public class Exercise05 {
    public static void main(String[] args) {

        /**
         *  To find PI you can use "Math.PI"  in multiplications you can use this one as a number function
         */

        // In fraction, always use one INTEGER with DECIMAL POINT to get accurate solution
        // Use 1.0 instead of 1 since 10 / 4 =2 (not 2.5)  not equal 10 / 4.0  = 2.5 in Java


        // Updated Version

        /*System.out.println(4 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));*/

        double solution = (4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11));
        System.out.println("Solution = " + solution);

        /*System.out.println(4 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));*/
        double solution2 = (4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13));
        System.out.print("Next Solution = " + solution2);


    }
}
