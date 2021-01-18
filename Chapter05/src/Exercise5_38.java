import java.util.Scanner;

public class Exercise5_38 {
    public static void main(String[] args) {

        // Decimal to Octal

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the decimal: ");
        int decimal = scanner.nextInt();

        System.out.println(Integer.toOctalString(decimal));
    }
}
