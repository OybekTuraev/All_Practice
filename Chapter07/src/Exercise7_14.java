import java.util.Scanner;

public class Exercise7_14 {
    public static void main(String[] args) {

        // Computing gcd

        final int LIMIT = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter five numbers: ");
        int[] numbers = new int[LIMIT];

        for (int i = 0; i < LIMIT; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The gcd is " + gcd(numbers));
    }

    public static int gcd(int... numbers){

        // First need to find the minimum of the numbers

        int gcd = 1;

        boolean checkDivisor;

       for (int divisor = 2; divisor <= min(numbers); divisor++){

           checkDivisor = true;

           for (int e: numbers){
               if (e % divisor != 0){
                   checkDivisor = false;
               }
           }

           if (checkDivisor){
               gcd = divisor;
           }
       }

        return gcd;
    }

    public static int min(int... numbers){

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }

        return min;
    }
}
