import java.util.Arrays;

public class N17 {
    public static void main(String[] args) {

        // Selection Sort for Decreasing order

        double[] list = {1, 0.5, 25.2, 96, 3, 9};
        System.out.println(Arrays.toString(sortedList(list)));
    }

    public static double[] sortedList(double[] list){

        for (int i = 0; i < list.length - 1; i++){

            double maxValue = list[i];
            int maxValueIndex = i;

            for (int j = i + 1; j < list.length; j++){
                if (list[j] > maxValue){
                    maxValue = list[j];
                    maxValueIndex = j;
                }
            }

            // Swap if not matched
            if (maxValueIndex != i){
                list[maxValueIndex] = list[i];
                list[i] = maxValue;
            }
        }

        return list;
    }
}
