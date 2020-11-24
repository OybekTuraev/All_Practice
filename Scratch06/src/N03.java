import java.util.Scanner;

public class N03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        double result = scanner.nextDouble();

        System.out.print("Enter your second score: ");
        double result1 = scanner.nextDouble();


        System.out.println("\nThe grade is " + getGrade(result));
        System.out.println("The grade is " + getGrade(result1));
    }

    public static char getGrade(double score){

        if (score >= 90){
            return 'A';
        }
        else if (score >= 80){
            return 'B';
        }
        else if (score >= 70){
            return 'C';
        }
        else if (score >= 60){
            return 'D';
        }
        else {
            return 'F';
        }
    }
}
