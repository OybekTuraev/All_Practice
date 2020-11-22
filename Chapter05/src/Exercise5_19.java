public class Exercise5_19 {
    public static void main(String[] args) {

        // Display numbers in a pyramid pattern

        final int LIMIT_NUM = 128;
        int max_spaces = 8;
        int space_in_line = 0;
        int start = 0;

        for (int count = 1; count <= LIMIT_NUM; count *= 2){

            space_in_line++;

            for (int space = 1; space <= max_spaces - space_in_line; space++){
                System.out.print("    ");
            }

            for (int left = 1; left <= count; left *= 2){
                System.out.printf("%4d", left);
            }

            // left *= 2 always consider the last value of left after each iteration

            for (int right = start; right > 0; right /= 2){
                System.out.printf("%4d", right);
            }

            start = count;

            // we need start , firstly not to write anything then it will == to count, but firstly zero
            // and also it avoids the first value of the count

            System.out.println();
        }
    }
}
