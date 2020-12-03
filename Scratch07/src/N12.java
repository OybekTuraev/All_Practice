public class N12 {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5};

        int[] reversedOne = reverse(list);

        for (int i = 0; i < reversedOne.length; i++) {

            System.out.print(reversedOne[i] + " ");
        }
  }

    public static int[] reverse(int[] list){

        int[] newList = new int[list.length];

        for (int i = 0; i < list.length; i++){
            newList[i] = list[list.length - 1 - i];
        }

        return newList;
    }
}
