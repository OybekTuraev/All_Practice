import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {

        // Row and Column  lengths
        int[][] array = new int[5][6];
        int row1 = array.length;
        int column1 = array[0].length;
        System.out.println(row1 + "\n" + column1);

        // Initializing arrays with input values
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[10][10];
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");

        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = scanner.nextInt();
            }
        }

        // Initializing arrays with random values
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){

                matrix[row][column] = (int)(Math.random() * 100);
            }
        }

        // Printing arrays
        for (int row = 0; row < matrix.length; row++){
            for (int coolumn = 0; coolumn < matrix[row].length; coolumn++){
                System.out.print(matrix[row][coolumn] + " ");
            }

            System.out.println();
        }

        // Summing all elements
        int total = 0;
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){

                total += matrix[row][column];
            }
        }

        // Summing elements by column
        for (int column = 0; column <matrix[0].length; column++){
            int totalSumOfColumns = 0;

            for (int row = 0; row < matrix.length; row++){
                totalSumOfColumns += matrix[row][column];
                System.out.println("Sum for column " + column + " is " + totalSumOfColumns);
            }
        }

        // Which row has the largest sum?
        int maxRow = 0;
        int indexOfMaxRow = 0;

        // Get the sum of the first row
        for (int column = 0; column < matrix[0].length; column++){
            maxRow += matrix[0][column];
        }


        for (int row = 1; row < matrix.length; row++){
            int computeThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++){

                computeThisRow += matrix[row][column];

                if (computeThisRow > maxRow){
                    maxRow = computeThisRow;
                    indexOfMaxRow = row;
                }
            }
        }

        System.out.println("The row with the highest sum is " + maxRow + " with index number:  " + indexOfMaxRow);

        // Random Shuffling
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){

                int i1 = (int)(Math.random() * matrix.length);
                int j1 = (int)(Math.random() * matrix[i].length);


                // Swap the matrix[i][j] with matrix[i1][j1]

                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }
    }
}
