import java.util.Scanner;

public class Exercise8_02 {
    public static void main(String[] args) {

        // Sum the major diagonal in matrix

        double[][] matrixDiagonal = readInput();

        calculateDiagonal(matrixDiagonal);
    }

    public static double[][] readInput(){
        final int ROW = 4;
        final int COLUMN = 4;

        double[][] matrix = new double[ROW][COLUMN];
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter a %d-by-%d matrix row by row: %n", ROW, COLUMN);

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = scanner.nextDouble();
            }
        }

        return matrix;
    }

    public static void calculateDiagonal(double[][] matrix){

        double majorD = 0;

        for (int row = 0; row < matrix.length; row++){
            majorD += matrix[row][row];
        }

        System.out.println("Sum of the elements in the major diagonal is " + majorD);
    }
}
