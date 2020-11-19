import java.util.Scanner;

public class N01 {
    public static void main(String[] args) {

        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        Scanner scanner  = new Scanner(System.in);

        System.out.print("What is " + num1 + " + " + num2 + "? ");
        int answer = scanner.nextInt();

        while (num1 + num2 != answer){
            System.out.println("Wrong answer. Try. What is " + num1 + " + " + num2 + "? ");
            answer = scanner.nextInt();
        }

        System.out.println("You git it!");
    }
}
