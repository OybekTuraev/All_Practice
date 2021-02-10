public class Exercise10_06 {
    public static void main(String[] args) {
        final int LIMIT = 120;
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 2; i < LIMIT; i++) {
           if (isPrime(i)) {
               stack.push(i); // to store the numbers in stack array memory
           }
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " "); // it takes numbers from the top of the stack to the below
        }
        System.out.println();
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
