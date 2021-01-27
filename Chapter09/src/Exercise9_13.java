import java.util.Scanner;

public class Exercise9_13 {
    public static void main(String[] args) {

        // Test Location Class
        double[][] array = getArray();

        // Creating new object through static method
        Location largestOfArray = Location.locateLargest(array);

        System.out.printf("The location of the largest is %.1f at (%d, %d)%n",
                largestOfArray.maxValue, largestOfArray.row, largestOfArray.column);
    }

    public static double[][] getArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the row and column: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        System.out.println("Enter the array: ");
        double[][] array = new double[row][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        return array;
    }
}

class Location {
    public int row;
    public int column;
    public double maxValue;

    Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] array) {
        int row = 0;
        int column = 0;
        double maxValue = array[row][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxValue < array[i][j]) {
                    maxValue = array[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        return new Location(row, column, maxValue);
    }
}
