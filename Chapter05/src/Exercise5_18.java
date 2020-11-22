import java.util.Scanner;

public class Exercise5_18 {
    public static void main(String[] args) {

       // Display four patterns using loops

        int NUM_OF_LINES = 6;

        System.out.println("Pattern A");

        for (int count = 1; count <= NUM_OF_LINES; count++){

            for (int pA = 1; pA <= count; pA++){
                System.out.print(pA + " ");
            }

            System.out.println(" ");
        }

        System.out.println("\nPattern B");
        for (int count = 1; count <= NUM_OF_LINES; count++){

            for (int pB = 1; pB <= 7 - count; pB++){
                System.out.print(pB + " ");
            }

            System.out.println();
        }

        System.out.println("\nPattern C");
        for (int count = 1; count <= NUM_OF_LINES; count++){

            for (int space = 1; space <= NUM_OF_LINES - count; space++){
                System.out.print("  ");
            }

            for (int pC = count; pC >= 1; pC--){
                System.out.print(pC + " ");
            }

            System.out.println();
        }

        System.out.println("\nPattern D");
        for (int count = 1; count <= NUM_OF_LINES; count++){

            for (int space = 1; space < count; space++){
                System.out.print("  ");
            }

            for (int pD = 1; pD <= 7 - count; pD++){
                System.out.print(pD + " ");
            }

            System.out.println();
        }
    }
}
