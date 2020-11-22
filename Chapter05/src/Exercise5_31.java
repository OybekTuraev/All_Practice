import java.util.Scanner;

public class Exercise5_31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double deposit = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double percentage = input.nextDouble();
        System.out.print("Enter number of months: ");
        int months = input.nextInt();

        System.out.println("Month  CD Value");

        for (int i = 1; i <= months; i++) {
            deposit += deposit * (percentage / 1200);
            System.out.printf("%-7d%.2f\n", i, deposit);
        }
    }
}
