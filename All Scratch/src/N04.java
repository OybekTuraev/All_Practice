import java.util.Scanner;

public class N04 {
    public static void main(String[] args){

        int num = (int)(Math.random() * 101);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess a magic number between 0 and 101");

        int guess = -1;
        while (guess != num){
            System.out.print("\nEnter your guess: ");
            guess = scanner.nextInt();

            if (guess == num){
                System.out.println("Yes. the number is " + num);
            }
            else if (guess > num){
                System.out.println("Your guess is too high");
            }
            else {
                System.out.println("Your guess is too low");
            }
        }
    }
}
