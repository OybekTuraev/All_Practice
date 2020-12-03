public class N10 {
    public static void main(String[] args) {

        int[] list1 = {1, 2, 3, 4, 5, 6};
        int[] list2 = reverse(list1);

        for (int e: list2){
            System.out.print(e + " ");
        }
    }

    public static int[] reverse(int[] list){

        int[] result = new int[list.length];

        for (int i = 0, j = list.length - 1; i < list.length; i++, j--){
            int temp = list[i];
            list[i] = result[j];
            result[j] = temp;
        }

        return result;

        /*int[] result = new int[list.length];

        for (int i = 0, j = list.length - 1; i < list.length; i++, j--){
            result[j] = list[i];
        }

        return result;*/
    }
}
