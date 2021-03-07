import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        try {
            int re = quotient(n1, n2);
            System.out.println(re);
        } catch (ArithmeticException error) {
            System.out.println("Exception: an integer cannot be divided by zero");
        }

        System.out.println("Execution continues ...");
    }

    private static int quotient(int n1, int n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }

        return n1 / n2;
    }
}
