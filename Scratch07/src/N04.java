public class N04 {
    public static void main(String[] args) {

        double[] myList = new double[10];

        // Shifting elements
        double temp = myList[0];

        // Shift elements left
        for (int k = 0; k < myList.length; k++){
            myList[k] = (int)(Math.random() * 100);
        }

        for (int i = 1; i < myList.length; i++){
           myList[i - 1] = myList[i];
       }

        // Move the first element to fill in the last position
        myList[myList.length - 1] = temp;

       for (int i = 0; i < myList.length; i++){
           System.out.println(myList[i]);
       }
    }
}
