public class Exercise5_35 {
    public static void main(String[] args) {

        // Summation

        final int LIMIT = 624;
        double sum = 0;

        for (int i = 1, j = i + 1; i <= LIMIT; i++){
            sum += 1 / (Math.sqrt(i) + Math.sqrt(j));
        }

        System.out.printf("%.2f%n", sum);
    }
}
