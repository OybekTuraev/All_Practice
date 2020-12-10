import java.util.Scanner;

public class Exercise8_06 {
    public static void main(String[] args) {

        // Algebra: multiply two matrices

        double[][] matrix1 = getMatrix(1);
        double[][] matrix2 = getMatrix(2);

        double[][] finalMatrix = multiplyMatrices(matrix1, matrix2);

        showResult(matrix1, matrix2, finalMatrix);
    }

    public static double[][] getMatrix(int number){
        final int ROW = 3;
        final int COL = 3;

        double[][] matrix = new double[ROW][COL];

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter matrix%d: ", number);

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                matrix[i][j] = scanner.nextDouble();
            }
        }

        return matrix;
    }

    public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2){
        final int ROW = 3;
        final int COL = 3;

        double[][] finalMatrix = new double[ROW][COL];

        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1.length; j++){
                for (int k = 0; k < matrix1.length; k++){
                    finalMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return finalMatrix;
    }

    public static void showResult(double[][] matrix1, double[][] matrix2, double[][] finalMatrix){

        for (int i = 0; i < matrix1.length; i++){
            printOneRow(matrix1, i);
            System.out.print((i == 1) ? "  *   " : "      ");
            printOneRow(matrix2, i);
            System.out.print((i == 1) ? "  =   " : "      ");
            printOneRow(finalMatrix, i);
            System.out.println();
        }
    }

    public static void printOneRow(double[][] matrix, int row){
        for (int i = 0; i < matrix[row].length; i++){
            System.out.printf("%-5.1f", matrix[row][i]);
        }
    }                                                   //1 2 3 4 5 6 7 8 9     0 2 4 1 4.5 2.2 1.1 4.3 5.2
}
