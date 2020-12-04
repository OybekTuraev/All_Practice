public class Exercise7_06 {
    public static void main(String[] args) {

        // Prime Numbers

        final int MAX_NUMBER = 50;

        int[] primeNumbers = new int[MAX_NUMBER];
        int index = 0;

        for (int i = 2; index < MAX_NUMBER; i++){

            if (isPrime(i)){
                primeNumbers[index]  = i;
                index++;
            }
        }

        printPrimeNumbers(primeNumbers);
    }

    public static boolean isPrime(int number){

        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){// if true, not a prime
                return false;
            }
        }

        return true;
    }

    public static void printPrimeNumbers(int[] primeNumbers){

        int perLine = 10;

        for (int i = 0; i < primeNumbers.length; i++){

            if ((i + 1) % perLine == 0){
                System.out.println(primeNumbers[i]);
            }
            else {
                System.out.print(primeNumbers[i] + " ");
            }
        }
    }
}
