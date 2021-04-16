import java.io.File;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception {
        File file = new File("scores.txt");

        try (
                Scanner scanner = new Scanner(file)
        ) {
            while (scanner.hasNext()) {
                String firstName = scanner.next();
                String mi = scanner.next();
                String lastName = scanner.next();
                int score = scanner.nextInt();
                System.out.println(firstName + " " + mi + " " + lastName + " " + score);
            }
        }
    }
}
