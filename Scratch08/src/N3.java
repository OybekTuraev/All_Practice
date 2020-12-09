import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {

                                // Pass Arrays
        int[][] array = getArray();

        // Display sum of elements
        System.out.println("\nThe sum of all elements is: " + sumElements(array));
    }

    public static int[][] getArray(){
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[3][4];
        System.out.println("Enter the " + array.length + " rows and " + array[0].length + " columns: ");
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){

                array[row][column] = scanner.nextInt();
            }
        }

        return array;
    }

    public static int sumElements(int[][] array){

        int total = 0;
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){

                total += array[row][column];
            }
        }

        return total;
    }
}
