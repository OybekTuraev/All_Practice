import java.util.Scanner;

public class Exercise5_08 {
    public static void main(String[] args) {

        // Find the highest score

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the students: ");
        String s = scanner.nextLine();

        int num_of_students = Integer.parseInt(s);

        int count = 0;
        int highest = 0;
        String name_highest = "";
        String name = "";


        while (count < num_of_students) {

            System.out.print("Enter the name and score of the student (Jane-45): ");
            String input = scanner.nextLine();

            int k = input.indexOf("-");
            name = input.substring(0, k);
            int score = Integer.parseInt(input.substring(k+1));

            if (score >= highest){
                highest = score;
                name_highest = name;
            }

            count++;
        }

        System.out.println("The student with highest score is " + name_highest + " with " + highest);
    }
}
