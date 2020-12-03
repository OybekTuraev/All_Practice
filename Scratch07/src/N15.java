public class N15 {
    public static void main(String[] args) {

        // Searching Binary Search  useful if the elements of the array in increasing order

        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int i = binarySearch(list, 2);
        int j = binarySearch(list, 11);
        int k = binarySearch(list, 12);
        int m = binarySearch(list, 79);
        int m1 = binarySearch(list, 1);
        int m2 = binarySearch(list, 0);

        System.out.println("Indices are " + i + "//" + j + "//" + k);
    }

    public static int binarySearch(int[] list, int key){

        // low,high,mid are indices
        int low = 0;
        int high = list.length - 1;

        while (high >= low){

            int mid = (low + high) / 2;

            if (key < list[mid]){
                high = mid - 1;
            }
            else if (key == list[mid]){
                return key;
            }
            else {
                low = mid + 1;
            }
        }

        return -low - 1; // Now high < low , key not found
    }
}
