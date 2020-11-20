public class Exercise5_15 {
    public static void main(String[] args) {

        // Display the ASCII character table

        final int PER_LINES = 10;
        char START_CHAR = '!';
        final char END_CHAR = '~';
        int count = 0;

        for (char i = START_CHAR; i <= END_CHAR; i++) {
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