public class Exercise5_23 {
    public static void main(String[] args) {

        // Demonstrate cancellation errors

        double sum_from_left = 0;
        double sum_from_right = 0;

        for (double i = 1; i <= 50000; i++){
            sum_from_left = sum_from_left + 1 / i;
        }

        for (double i = 50000; i >= 1.0; i--){
            sum_from_right = sum_from_right + 1 / i;
        }

        System.out.println("Sum from left to right: " + sum_from_left);
        System.out.println("Sum from right to left: " + sum_from_right + "\n");
        System.out.println("Difference: " + (sum_from_right - sum_from_left));
    }
}
