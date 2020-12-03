import java.util.Scanner;

public class N01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of throws: ");
        int throwCount = scanner.nextInt();

        int [] outcomeCounts = new int[11]; // no need initialization
        // last one k - 1, like outcomesCounts[10] gives the last one

        for (int i = 0; i < throwCount; i++){
            int die1 = random(1, 6);
            int die2 = random(1, 6);
            int sum = die1 + die2;

            // 2 -> 0
            // 3 -> 1
            // 4 -> 2
            // 5 -> 3

            outcomeCounts[sum - 2]++;
        }

        for (int i = 0; i < outcomeCounts.length; i++){
            System.out.printf("%d: %d%n", i + 2, outcomeCounts[i]);
        }
    }

    public static int random(int min, int max){

        return (int)(min + Math.random() * (max - min + 1));
    }
}
