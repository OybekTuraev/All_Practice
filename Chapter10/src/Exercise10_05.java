import java.util.Scanner;

public class Exercise10_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        System.out.println("Small factors of " + number + ": ");
        StackOfIntegers stack = new StackOfIntegers();

        factors(number, stack);

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static void factors(int number, StackOfIntegers stack) {
        int divisor = 2;
        while (number / divisor != 1) {
            if (number % divisor == 0) {
                stack.push(divisor);// here collecting and sending numbers in stack
                number /= divisor; // and remove the divisor from the number
            }
            else {
                divisor++;
            }
        }

        stack.push(number); // at the end, adding the number itself to the stack
    }
}
