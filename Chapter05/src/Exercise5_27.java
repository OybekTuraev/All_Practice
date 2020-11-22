public class Exercise5_27 {
    public static void main(String[] args) {

       // Display leap years

        final int PER_LINE = 10;
        final int STAR = 101;
        final int END = 2100;
        int count = 0;

        for (int i = STAR; i <= END; i++){

            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                count++;

                if (count % PER_LINE == 0){
                    System.out.println(i);
                }
                else {
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println("\n\nNumber of Leap Years: " + count);
    }
}
