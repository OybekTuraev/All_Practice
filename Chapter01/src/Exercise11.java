public class Exercise11 {
    public static void main(String[] args) {

        /**
         * Write a program that solves the following equation and displays the value for x and y:
         *                    3.4x + 50.2y = 44.5
         *                    2.1x + .55y = 5.9
         */

        //Solve it with Cramer's rule  2 * 2 (Determinant)

        System.out.print("X = ");
        System.out.println(((44.5 * 0.55) -(50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1)));

        System.out.print("Y = ");
        System.out.println(((3.4 * 5.9) - (44.5 * 2.1) ) / ((3.4 * 0.55) - (50.2 * 2.1)));
    }
}
