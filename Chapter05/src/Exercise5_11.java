public class Exercise5_11 {
    public static void main(String[] args) {

        // Find numbers divisible by 5 or 6, but not both

        final int PER_LINE = 10;
        int count = 0;

        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 ^ i % 6 == 0){

                count++;

                if (count % PER_LINE == 0){
                    System.out.println(i);
                }
                else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
