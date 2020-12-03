import java.util.Scanner;

public class N02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] myList = new double[5];

        // Initialize array with input values
        System.out.print("Enter " + myList.length + " values: ");

        for (int i = 0; i < myList.length; i++){
            myList[i] = scanner.nextDouble();
        }

        System.out.println(myList[4]);
        System.out.println(myList[1]);
        System.out.println(myList[0]);

        // Initialize array with random numbers using for loop
        for (int i = 0; i < myList.length; i++){
            myList[i] = (Math.random() * 100.0);
        }

        //Displaying arrays
        for (int i = 0; i < myList.length; i++){
            System.out.println(myList[i] + " ");
        }

        char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
        System.out.println(city);
    }
}
