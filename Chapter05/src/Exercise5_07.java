public class Exercise5_07 {
    public static void main(String[] args) {

        // Financial Application

        final int NUM_OF_YEARS = 14;
        final double INCREASE_PERCENT = 0.05;
        int year = 1;
        int after_four_year = 0;
        int after_ten_year = 0;
        int tuition = 10_000;

        while (year <= NUM_OF_YEARS) { // when year 1, tuition increases, it means after one year
            tuition += INCREASE_PERCENT * tuition;

            if (year == 10) { // After tenth year
                after_ten_year = tuition;
            }

            if (year > 10) {
                after_four_year += tuition;
            }

            year++;
        }

        System.out.println("Tuition after ten years is $" + after_ten_year);
        System.out.println("Total tuition after four years is $" + after_four_year);
    }
}
