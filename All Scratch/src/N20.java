public class N20 {
    public static void main(String[] args){

        // Displaying Prime Numbers

        final int NUM_OF_PRIMES = 50;
        final int NUM_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int num = 2;

        System.out.println("The first 50 prime numbers are \n");

        while (count < NUM_OF_PRIMES){

            boolean isPrime = true; // Is the current number Prime?

            for (int divisor = 2; divisor <= num / 2; divisor++) { //checks by repeating number(+1) up to num/2
                if (num % divisor == 0){ // if true, not prime
                    isPrime = false; // set to false
                    break; // exit the loop
                }
            }

            if (isPrime){ // it means true, to check in case when in false in
                count++;

                // check the lines if ten character then to new line

                if (count % NUM_OF_PRIMES_PER_LINE == 0){
                    System.out.println(num);
                }
                else {
                    System.out.print(num + " ");
                }
            }

            num++;
        }
    }
}
