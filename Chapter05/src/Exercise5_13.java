public class Exercise5_13 {
    public static void main(String[] args) {

        // Find the largest n such that n^3 < 12,000

        int n = 0;

        while (n < 12_000) {
            if ((n * n * n) > 12_000){

                // if n's 3degree is the first bigger number than 12_000, then the number one less than it,
                // it will be the largest n^3 smaller than 12_000

                System.out.println(n - 1);
                break; // exit immediately after finding the corresponding n
            }

            n++;
        }
    }
}
