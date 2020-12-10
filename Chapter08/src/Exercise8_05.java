import java.util.Scanner;

public class Exercise8_05 {
    public static void main(String[] args) {

        // Algebra:  Add two Matrices

        double[][] matrix1 = getMatrix(1);
        double[][] matrix2 = getMatrix(2);

        double[][] finalMatrix = addTwoMatrices(matrix1, matrix2);

        showResult(matrix1, matrix2, finalMatrix);
    }

    public static double[][] getMatrix(int number){
        final int ROW = 3;
        final int COL = 3;

        double[][] matrix = new double[ROW][COL];

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter matrix%d: ", number);

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = scanner.nextDouble();
            }
        }

        return matrix;
    }

    public static double[][] addTwoMatrices(double[][] matrix1, double[][] matrix2){
        final int ROW = 3;
        final int COL = 3;

        double[][] finalMatrix =  new double[ROW][COL];

        for (int i = 0; i < finalMatrix.length; i++){
            for (int j = 0; j < finalMatrix.length; j++){
                finalMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return finalMatrix;
    }

    public static void showResult(double[][] matrix1, double[][] matrix2, double[][] finalMatrix){

        for (int i = 0; i < matrix1.length; i++){
            printOneRow(matrix1, i);
            System.out.print((i == 1) ? "  +  " : "     ");
            printOneRow(matrix2, i);
            System.out.print((i == 1) ? "  =  " : "     ");
            printOneRow(finalMatrix, i);
            System.out.println();
        }
    }

    public static void printOneRow(double[][] matrix, int row){
        for (int i = 0; i < matrix[row].length; i++){
            System.out.print(matrix[row][i] + " ");
        }
    }
}
