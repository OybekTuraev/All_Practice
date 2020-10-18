public class Exercise3_16 {
    public static void main(String[] args) {

        /**
         * Random point
         */

        final int WIDTH = 100;
        final int HEIGHT = 200;

        // x must be between -50 and 50
        // y must be between -100 and 100

        int x = (int) ((Math.random() * (WIDTH)) - WIDTH / 2);
        int y = (int) ((Math.random() * (HEIGHT)) - HEIGHT / 2);

        System.out.println( "(" + x + ";" + y + ")");
    }
}
