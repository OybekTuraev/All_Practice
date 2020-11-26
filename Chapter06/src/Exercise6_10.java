public class Exercise6_10 {
    public static void main(String[] args) {

        // Use isPrime Method

        System.out.println("The number of Prime numbers less than 10000  are \n");

        printPrimeNumbers(10000);
    }

    public static void printPrimeNumbers(int numberOfPrimes){

        isPrime(numberOfPrimes);
    }

    public static void isPrime(int limit){

        final int PER_LINE = 10;

        int count = 0;

        for (int number = 2; number < limit; number++){

            if(checkPrime(number)){
                count++;

                if (count % PER_LINE == 0){
                    System.out.println(number);
                }
                else {
                    System.out.print(number + " ");
                }
            }
        }
    }

    public static boolean checkPrime(int number){

        for (int divisor = 2; divisor <= number / 2; divisor++){
            if (number % divisor == 0){
                return false;
            }
        }

        return true;
    }
}
