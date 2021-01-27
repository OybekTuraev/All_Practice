import java.util.Random;

public class Exercise9_04 {
    public static void main(String[] args) {

        // Use the Random Class, if created new object with same seed ,
        // they will generate the same number of sequences
        Random object = new Random(1000);

        for (int i = 1; i <= 50; i++) {
            int num = object.nextInt(100);
            if (i % 10 == 0) {
                System.out.println(num);
            }
            else {
                System.out.print(num + " ");
            }
        }
    }
}
