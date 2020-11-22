public class Exercise5_26 {
    public static void main(String[] args) {

        // Compute e

        double sumE = 0;

        for (double i = 1; i <= 20000; i++){

            double denominator = i;

            for (double j = i - 1; j >= 1; j--){
                denominator *= j;
            }

            sumE += 1 / denominator;
        }

        System.out.println("E is " + sumE);
    }
}
