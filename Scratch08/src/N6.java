import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class N6 {
    public static void main(String[] args) {

                            //  Sudoku

        int[][] grid = readASolution();

        System.out.println((isValid(grid))? "Valid Solution" : "Invalid Solution");
     }

    // Read from the console
    public static int[][] readASolution(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution: ");

        int[][] grid = new int[9][9];

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                grid[i][j] = scanner.nextInt();
            }
        }

        return grid;
    }

    // Check incorrect range and solution is valid
    public static boolean isValid(int[][] grid){

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (grid[i][j] < 1 || grid[i][j] > 9 || !(isValid(i, j, grid))){
                    return false;
                }
            }
        }

        return true;
    }

    // Check Check every element in row and column
    public static boolean isValid(int i, int j, int grid[][]){

        // Check grid[i][j] uniqueness for every row, i to check elements more than once
        for (int column = 0; column < 9; column++){
            if (column != j && grid[i][j] == grid[i][column]){
                return false;
            }
        }

        // Check grid[i][j] uniqueness for every column, j to check elements more than once
        for (int row = 0; row < 9; row++){
            if (row != i && grid[row][j] == grid[i][j]){
                return false;
            }
        }
        // Check grid[i][j] uniqueness for 3 x 3 box, grid[i][j] to check elements more than once
        for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++){
            for (int column = (j / 3) * 3; column < (j / 3) * 3 + 3; column++){
                if (row != i && column != j && grid[row][column] == grid[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
}
