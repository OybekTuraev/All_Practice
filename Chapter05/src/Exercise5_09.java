import java.util.Scanner;

public class Exercise5_09 {
    public static void main(String[] args) {

        // Find the two highest scores

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the students: ");
        String s = scanner.nextLine();

        int num_of_students = Integer.parseInt(s);

        int count = 0;
        int score = 0;
        int highest1 = 0;
        int highest2 = 0;
        String name_highest1 = "";
        String name_highest2 = "";
        String name = "";

        while (count < num_of_students) {
            System.out.print("Enter the name and score of the student(Jane-65): ");
            String input = scanner.nextLine();

            int k = input.indexOf("-");
            name = input.substring(0, k);
            score = Integer.parseInt(input.substring(k+1));

            if (score > highest1) {
                highest2 = highest1;
                name_highest2 = name_highest1;

                highest1 = score;
                name_highest1 = name;
            }
            else if (score > highest2){
                highest2 = score;
                name_highest2 = name;
            }

            count++;
        }

        System.out.println("The highest student: " + name_highest1 + " with " + highest1);
        System.out.println("The second highest student: " + name_highest2 + " with " + highest2);
    }
}
