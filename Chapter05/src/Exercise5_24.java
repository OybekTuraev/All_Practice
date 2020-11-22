public class Exercise5_24 {
    public static void main(String[] args) {

        // Sum a series

        double sum = 0;

        for (double i = 1.0, j = 3.0; i < 98 && j < 100; i += 2, j += 2){
            sum += i / j;
        }

        System.out.println("The sum is " + sum);
    }
}
