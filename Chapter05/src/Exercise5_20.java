public class Exercise5_20 {
    public static void main(String[] args) {

        // Display Prime numbers between 2 and 100

        final int PER_LINE = 8;
        int count = 0;

        for (int num = 2; num <= 1000; num++){

            boolean isPrime = true;

            for (int divisor = 2; divisor <= num / 2; divisor++){
                if (num % divisor == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                count++;

                if (count % PER_LINE == 0){
                    System.out.println(num);
                }
                else {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
