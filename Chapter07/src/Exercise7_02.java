import java.util.Scanner;

public class Exercise7_02 {
    public static void main(String[] args) {

        // reverse the numbers entered

        Scanner scanner = new Scanner(System.in);
        int[] list = {10, 9, 8, 7, 6};

        reverse(list);

        printReversedOne(list);
    }

    // i < j , stops when all elements reversed, if i < list.length, it will do twice, then no change
    public static void reverse(int[] list){
        for (int i = 0, j = list.length - 1; i < j; i++, j--){
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }

    public static void printReversedOne(int[] list){
        for (int e : list){
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
