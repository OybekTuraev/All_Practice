public class Exercise6_13 {
    public static void main(String[] args) {

        // Sum series

        final int NUM_LINES = 20;

        System.out.println("i            m(i)");
        System.out.println("----------------------");

        sumSeries(NUM_LINES);
    }

    public static void sumSeries(int limitNumber){

        for (int i = 1; i <= limitNumber; i++){
            System.out.printf("%-13d%.4f", i, computeSeries(i));
            System.out.println();
        }
    }

    public static double computeSeries(int number){

        double compute = 0;

        for (double i = 1; i <= number; i++){

            compute += (i / (i + 1));
        }

        return compute;
    }

}
