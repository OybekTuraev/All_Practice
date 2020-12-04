import java.util.Scanner;

public class Exercise7_10 {
    public static void main(String[] args) {

        // Find the index of the smallest element

        Scanner scanner = new Scanner(System.in);

        final int LIMIT = 10;
        double[] inputs = new double[LIMIT];

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < LIMIT; i++){
            inputs[i] = scanner.nextDouble();
        }

        System.out.printf("The index of the smallest element is: %d%n", indexOfSmallestElement(inputs));
    }

    public static int indexOfSmallestElement(double[] array){

        int index = 0;
        double minNumber = array[0];

        for (int i = 0; i < array.length; i++){

            if (array[i] < minNumber){
                minNumber = array[i];
                index = i;
            }
        }

        return index;
    }
}
