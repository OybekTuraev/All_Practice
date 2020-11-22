public class Exercise5_25 {
    public static void main(String[] args) {

        // Compute PI

        double sum = 0;

        for (int i = 1; i <= 100000; i++){
            sum += (Math.pow(-1, i + 1)) / (2 * i - 1);
        }

        System.out.println("PI is " + (4 * sum));
    }
}
