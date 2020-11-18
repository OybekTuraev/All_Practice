import java.util.Scanner;

public class N10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num, sum = 0, count;

        for (count = 0; count < 5; count++) {
            num = scanner.nextInt();
            sum += num;
        }

        System.out.println("sum is " + sum);
        System.out.println("count is " + count);
    }
}
