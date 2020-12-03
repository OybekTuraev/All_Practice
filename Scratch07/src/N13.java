import java.util.Scanner;

public class N13 {
    public static void main(String[] args) {

        // Searching: Linear vs Binary Search

        int[] list = {1, 4, 5, 5, -3, 6, 9, -9};
        int i = linearSearch(list, 4);
        int j = linearSearch(list, -3);
        int k = linearSearch(list, -9);

        System.out.println("Indices are " + i + "//" + j + "//" + k);
    }

    public static int linearSearch(int[] list, int key){

        for (int i = 0; i < list.length; i++){
            if (key == list[i]){
                return i;
            }
        }

        return -1;
    }
}
