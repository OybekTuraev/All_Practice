import java.util.Scanner;

public class Exercise5_37 {
    public static void main(String[] args) {

        // Decimal to binary

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the decimal: ");
        int decimal = scanner.nextInt();

        System.out.println(Integer.toBinaryString(decimal));
    }
}
