import java.util.Scanner;

public class N09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num;

        do {
            System.out.print("Enter an integer and 0 to quit: ");
            num = scanner.nextInt();

            sum += num;
        } while (num != 0);

        System.out.println("The sum is " + sum);
    }
}
