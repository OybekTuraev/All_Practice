import java.util.Scanner;

public class N02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        double result = scanner.nextDouble();

        System.out.print("Enter your second score: ");
        double result1 = scanner.nextDouble();

        System.out.print("The grade is ");
        printGrade(result);

        System.out.print("The grade is ");
        printGrade(result1);
    }

    public static void printGrade(double score){

        if (score > 100 || score < 0){
            System.out.println("Invalid Code");
            return;
        }
        else if (score >= 90){
            System.out.println('A');
        }
        else if (score >= 80){
            System.out.println('B');
        }
        else if (score >= 70){
            System.out.println('C');
        }
        else if (score >= 60){
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
    }
}
