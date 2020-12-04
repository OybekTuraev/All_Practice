import java.util.Scanner;

public class Exercise7_01 {
    public static void main(String[] args) {

        // Assign grades

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int[] scores = new int[scanner.nextInt()];
        char[] letterGrades = new char[scores.length];

        System.out.print("Enter " + scores.length + " scores: ");

        for (int i = 0; i < scores.length; i++){
            scores[i] = scanner.nextInt();
            max(scores);
        }

        calculateGrades(scores, letterGrades);

        for (int i = 0; i < scores.length; i++){
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + letterGrades[i]);
        }
    }

    public static void calculateGrades(int[] scores, char[] letterGrades){

        int max = max(scores);

        for (int i = 0; i < scores.length; i++){

            if (scores[i] >= max - 10){
                letterGrades[i] = 'A';
            }
            else if (scores[i] >= max - 20){
                letterGrades[i] = 'B';
            }
            else if (scores[i] >= max - 30){
                letterGrades[i] = 'C';
            }
            else if (scores[i] >= max - 40){
                letterGrades[i] = 'D';
            }
            else {
                letterGrades[i] = 'F';
            }
        }
    }

    public static int max(int[] scores){

        int max = 0;
        for (int score: scores) {

            if (score > max) {
                max = score;
            }
        }

        return max;
    }
}
