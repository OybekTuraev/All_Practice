import java.util.Arrays;

public class N16 {
    public static void main(String[] args) {

        // Selection Sort for Increasing order

        double[] list = {1, 0.5, 25.2, 96, 3, 9};
        System.out.println(Arrays.toString(sortedList(list)));
    }

    public static double[] sortedList(double[] list){

        for (int i = 0; i < list.length - 1; i++){

            double minValue = list[i];
            int minValueIndex = i;

            for (int j = i + 1; j < list.length; j++){
                if (list[j] < minValue){
                    minValue = list[j];
                    minValueIndex = j;
                }
            }

            if (minValueIndex != i){
                list[minValueIndex] = list[i];
                list[i] = minValue;
            }
        }

        return list;
    }
}
