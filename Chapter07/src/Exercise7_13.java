public class Exercise7_13 {
    public static void main(String[] args) {

        
        // Random number chooser

        int[] numbers = {1, 5, 6, 10, 50};

        System.out.println(getRandom(numbers));
    }

    public static int getRandom(int... numbers){

        int randomNumber = 0;

        boolean checkExcluded = true;

        do {

            checkExcluded = false;           // if we get random it will stop with that

            randomNumber = (int)(Math.random() * (54) + 1);

            for (int e : numbers){
                if (e == randomNumber){
                    checkExcluded = true;      // it means do it again
                }
            }
        } while (checkExcluded);

        return randomNumber;
    }
}
