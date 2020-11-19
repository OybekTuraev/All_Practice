import java.util.Scanner;

public class Exercise5_10 {
    public static void main(String[] args) {

        // Find numbers divisible by 5 and 6

        final int PER_LINES = 10;

        int count = 0;
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0){

                count++;

                if (count % PER_LINES == 0){
                    System.out.println(i);
                }
                else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
