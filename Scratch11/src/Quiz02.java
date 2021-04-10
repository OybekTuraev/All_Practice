public class Quiz02 {
    public static void main(String[] args) {
        Integer[] list1 = {12, 45, 89};
        Double[] list2 = {12.3, 45.1, 89.0};
        int[] list3 = {1, 4, 8};

        printArray(list1);
        printArray(list2);
        //printArray(list3);
        // here is the problem since int cannot pass a reference to the object
    }

    public static void printArray(Object[] list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
