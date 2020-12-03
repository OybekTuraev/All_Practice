public class N14 {
    public static void main(String[] args) {

        // VarArgs or Variable-Length Arguments list

        printMax(1, 2, 34, 96);
        printMax(new int[]{1, 89, 65, 54});
    }

    public static void printMax(int... numbers){

        if (numbers.length == 0){
            System.out.println("The arguments not passed, Sorry");
        }

        double result = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > result){
                result = numbers[i];
            }
        }

        System.out.println("The max value is " + result);
    }
}
