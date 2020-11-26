public class Exercise6_14 {
    public static void main(String[] args) {

        // Estimate Pi

        System.out.println("i              m(i)");
        System.out.println("-----------------------");

        final int END_VALUE = 901;

        displayTable(END_VALUE);
    }

    public static void displayTable(int endValue){
        for (int i = 1; i <= endValue; i += 100){
            System.out.printf("%-15d%.4f", i, computePi(i));
            System.out.println();
        }
    }

    public static double computePi(int number){

        double compute = 0;

        for (int i = 1; i <= number; i++){

            compute += 4 * ((Math.pow(-1, i + 1)) /  (2 * i - 1));
        }

        return compute;
    }
}
