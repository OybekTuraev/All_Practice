import java.util.Scanner;

public class Exercise8_01 {
    public static void main(String[] args) {

        // Sum elements column by column

        double[][] array = readInput();

        showSum(array);
    }

    public static double[][] readInput(){
        final int ROW = 3;
        final int COLUMN = 4;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter a %d-by-%d matrix row by row: %n", ROW, COLUMN);

        double[][] array = new double[ROW][COLUMN];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){

                array[i][j] = scanner.nextDouble();
            }
        }

        return array;
    }

    public static void showSum(double[][] array){

        for (int column = 0; column < array[0].length; column++){
            System.out.println("Sum of the elements at column " + column + " is " + sumColumn(array, column));
        }
    }

    public static double sumColumn(double[][] array, int column){

        double sum = 0;
        for (int row = 0; row < array.length; row++) {
                sum += array[row][column];
        }

        return sum;
    }
}
