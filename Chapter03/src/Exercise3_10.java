import java.util.Scanner;

public class Exercise3_10 {
    public static void main(String[] args){

        /**
         * Game: addition quiz
         */

        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        int num3 = (int)(Math.random() * 100);
        int num4 = (int)(Math.random() * 100);

        if (num1 < num2){
            int change = num1;
            num1 = num2;
            num2 = change;
        }

        if (num3 < num4){
            int change1 = num3;
            num3 = num4;
            num4 = change1;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is " + num1 + " - " + num2 + "? ");
        int ans = scanner.nextInt();
        System.out.print("What is " + num3 + " - " + num4 + "? ");
        int ans1 = scanner.nextInt();

        if (num1 - num2 == ans && num3 - num4 == ans1){
            System.out.println("You are correct!");
        }
        else {
            System.out.println("Your answer is wrong");
            System.out.println(num1 + " - " + num2 + " is " + (num1 - num2));
            System.out.println(num3 + " - " + num4 + " is " + (num3 - num4));
        }
    }
}
