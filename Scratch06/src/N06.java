public class N06 {
    public static void main(String[] args) {

        System.out.println("The first 50 Prime Numbers are \n");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes){

        final int PER_LINES = 10;
        int count = 0;
        int number = 2;

        while (count < numberOfPrimes){

            if (isPrime(number)){
                count++;

                if (count % PER_LINES == 0){
                    System.out.printf("%-5s\n", number);
                }
                else {
                    System.out.printf("%-5s", number);
                }
            }

            number++;
        }
    }

    public static boolean isPrime(int number){

        for (int divisor = 2; divisor <= number / 2; divisor++){
            if (number % divisor == 0){ // if true, not a prime number
                return false;
            }
        }

        return true;
    }
}
