public class N06 {
    public static void main(String[] args) {

        int[] myList = new int[4];

        // For each element of the myList, add 2 and print
        for (int e: myList){
            if (e % 2 != 0){
                e += (e + 2);
            }
            else {
                e += 1;
            }
           // System.out.println(e);
        }
    }
}
