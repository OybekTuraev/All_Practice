import java.util.Scanner;

public class N06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer and 0 to quit: ");
        int data = scanner.nextInt();

        int sum = 0;
        while (data != 0){
            sum += data;

            System.out.print("Enter an integer and 0 to quit: ");
            data = scanner.nextInt();
        }

        System.out.println("The sum is " + sum);
    }
}
