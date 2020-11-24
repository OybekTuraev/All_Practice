import java.util.Random;
import java.util.Scanner;

public class Exercise5_34 {
    public static void main(String[] args) {

        // Game: scissor, rock, paper

        Scanner scanner = new Scanner(System.in);

        int count_correct = 0;
        int count_comp = 0;

        // if one of them is greater than 2, it stops and exits.

        while (count_comp <= 2 && count_correct <= 2){

            Random generator = new Random();
            int random_number = generator.nextInt(3);  // till 3, not included 3;

            System.out.print("scissor (0), rock (1), paper (2): ");
            int guess = scanner.nextInt();

            switch (random_number){
                case 0:
                    if (guess == 0){
                        System.out.println("Computer is scissor. You are scissor too. it is a draw");
                    }
                    else if (guess == 1) {
                        System.out.println("Computer is scissor. You are rock. You won");
                        count_correct++;
                    }
                    else if(guess == 2) {
                        System.out.println("Computer is scissor. Your are paper. You lost");
                        count_comp++;
                    }
                    else {
                        System.out.println("Invalid value");
                    }
                    break;

                case 1:
                    if (guess == 0) {
                        System.out.println("Computer is rock. You are scissor. You lost");
                        count_comp++;
                    }
                    else if (guess == 1) {
                        System.out.println("Computer is rock. You are rock too. It is a draw");
                    }
                    else if (guess == 2) {
                        System.out.println("Computer is rock. Your are paper. You won");
                        count_correct++;
                    }
                    else {
                        System.out.println("Invalid value");
                    }
                    break;

                case 2:
                    if (guess == 0) {
                        System.out.println("Computer is paper. You are scissor . You won");
                        count_correct++;
                    }
                    else if (guess == 1) {
                        System.out.println("Computer is paper. You are rock. You lost");
                        count_comp++;
                    }
                    else if (guess == 2) {
                        System.out.println("Computer is paper. Your are paper too. It is a draw");
                    }
                    else {
                        System.out.println("Invalid value");
                    }
            }
        }
    }
}
