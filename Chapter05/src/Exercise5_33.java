public class Exercise5_33 {
    public static void main(String[] args) {

        // Perfect Number

        for (int i = 6; i <= 10000; i++){

            int divisor_sum = 0;

            for (int divisor = 1; divisor < i; divisor++){
                if (i % divisor == 0){
                    divisor_sum += divisor;
                }
            }

            if (divisor_sum == i){
                System.out.println(i);
            }
        }
    }
}
