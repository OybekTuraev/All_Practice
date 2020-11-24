public class N01 {
    public static void main(String[] args) {

        // Test Max

        int i = 5;
        int j = 2;
        int k = max(i, j);

        System.out.println("The maximum value of " + i + " and " + j + ": " + k);
    }

    public static int max(int num1, int num2){

       return num1 < num2 ? num2 : num1;
    }
}
