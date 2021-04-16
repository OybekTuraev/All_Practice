import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double d = scanner.nextDouble();
        String s = scanner.nextLine(); // Here after the token-reading method nextLine will read
        // before the line separator but before it nothing is there and ends after the line separator
        //So token-reading method stops reading just at delimiters, not finish the line
        String ss = scanner.nextLine();
        System.out.println(n + ", " + d + ", " + s + ", " + ss);
    }
}
