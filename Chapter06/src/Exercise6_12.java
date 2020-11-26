public class Exercise6_12 {
    public static void main(String[] args) {

        // Display Characters

        final int PER_LINE = 10;
        char ch1 = '1';
        char ch2 = 'Z';

        System.out.println("\nCharacters between "  + ch1 + " and " + ch2 + "\n");

        printChars(ch1, ch2, PER_LINE);
    }

    public static void printChars(char ch1, char ch2, int perLines){

        int count = 0;

        for (char ch = ch1; ch <= ch2; ch++){

            count++;

            if (count % perLines == 0){
                System.out.println(ch);
            }
            else {
                System.out.print(ch + " ");
            }
        }
        System.out.println();
    }
}
