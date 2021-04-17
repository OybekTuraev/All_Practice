import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int n1, n2;
        boolean isTrue = false;

        do {
            try {
                n1 = scanner.nextInt();
                n2 = scanner.nextInt();

                System.out.println("The sum is " + (n1 + n2));
                isTrue = true;
            }
            catch (java.util.InputMismatchException ex) {
                scanner.nextLine();
                System.out.print("Incorrect: Reenter: ");
            }

        } while (!isTrue);
    }
}
