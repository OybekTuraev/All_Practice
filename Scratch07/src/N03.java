public class N03 {
    public static void main(String[] args) {

        int total = 0;
        double[] myList = new double[3];

        for (int i = 0; i < myList.length; i++){
            total += myList[i];
        }
        System.out.println(total);

        // Finding the greatest value
        double max = myList[0];

        for (int i = 0; i < myList.length; i++){
            max = (myList[i] > max) ? myList[i] : max;
        }

        // Finding the smallest index of the largest element
        double max1 = myList[0];
        double indexOfMax = 0;

        for (int i = 0; i < myList.length; i++){
            if (myList[i] > max1){
                max1 = myList[i];
                indexOfMax = i;
            }
        }

        // Random shuffling
        for (int i = myList.length - 1; i > 0; i--){

            int j = (int) (Math.random() * (i + 1));

            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
            System.out.println(myList[i] + "//" + myList[j]);
        }
    }
}
