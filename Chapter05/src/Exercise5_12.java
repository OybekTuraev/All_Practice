public class Exercise5_12 {
    public static void main(String[] args) {

        // Find the smallest n^2 > 12_000

        int n = 0;
        while (n < 12_000) {
            if (n * n > 12_000){
                System.out.println("The smallest n for n^2 > 12000: " + n);
                break;
            }
            n++;
        }
    }
}
