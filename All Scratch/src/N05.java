import java.util.Scanner;

public class N05 {
    public static void main(String[] args){

        final int NUM_QUESTIONS = 5;
        int correct_counter = 0;
        int count = 0;
        long start_time = System.currentTimeMillis();
        String output = " ";

        Scanner scanner = new Scanner(System.in);

        while (count < NUM_QUESTIONS){
            int num1 = (int)(Math.random() * 10);
            int num2 = (int)(Math.random() * 10);

            if (num2 > num1){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            System.out.print("What is " + num1 + " - " + num2 + "? ");
            int answer = scanner.nextInt();

            if (num1 - num2 == answer){
                System.out.println("You are correct\n");
                correct_counter++;
            }
            else {
                System.out.println("The answer should be " + (num1 - num2) + "\n");
            }

            count++;

            output += "\n" + num1 + " - " + num2 + " = " + answer + ((num1 - num2 == answer) ? " correct" : " wrong");
        }

        long end_time = System.currentTimeMillis();
        long duration = end_time - start_time;

        System.out.println("Correct count is " + correct_counter + "\nTest time is " + duration / 1000
                + " seconds\n" + output);
    }
}
