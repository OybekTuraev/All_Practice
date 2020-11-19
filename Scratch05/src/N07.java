import java.util.Scanner;

public class N07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int max = num;

        while (num != 0){
            num = scanner.nextInt();
            if (num > max){
                max = num;
            }
        }
        System.out.println("max is " + max);
        System.out.println("number is " + num);
    }
}
