import java.util.Scanner;

public class N08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int data;
        int sum = 0;

        do {
            System.out.print("Enter an integer and 0 to quit: ");
            data = scanner.nextInt();

            sum += data;
        } while (data != 0);

        System.out.println("The sum is " + sum);
    }
}
