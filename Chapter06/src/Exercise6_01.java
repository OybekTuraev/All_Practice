public class Exercise6_01 {
    public static void main(String[] args) {

        // Math. Pentagonal Numbers

        printPentagonalNumber();
    }

    public static void printPentagonalNumber(){
        System.out.println("           First 100 Pentagonal Numbers are \n");
        getPentagonalNumber(100);
    }

    public static void getPentagonalNumber(int n){

        final int PER_LINE = 10;
        int penNumber = 0;

        for (int i = 1; i <= n; i++){
            penNumber = (i * (3 * i - 1)) / 2;

            if (i % PER_LINE == 0){
                System.out.println(penNumber);
            }
            else {
                System.out.print(penNumber + " ");
            }
        }
    }
}
