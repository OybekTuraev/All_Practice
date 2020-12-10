public class Exercise8_04 {
    public static void main(String[] args) {

        // Compute the weekly hours for each employee

        int[][] data = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9},
        };

        // Calculating the sum
        int[] sum = new int[data.length];

        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[i].length; j++){
                sum[i] += data[i][j];
            }
        }

        sortInDecreaseOrder(sum);

        // Display the result
        for (int i = 0; i < data.length; i++){
            System.out.println("Employee " + i + "'s total hours in one week is " + sum[i]);
        }
    }

    public static void sortInDecreaseOrder(int[] sum){

        for (int i = 0; i < sum.length - 1; i++){

            int max = sum[i];
            int maxIndex = i;

            // To check the next values
            for (int j = i + 1; j < sum.length; j++){
                if (max < sum[j]){
                    max = sum[j];
                    maxIndex = j;
                }
            }

            // Swap
            if (maxIndex != i){
                sum[maxIndex] = sum[i];
                sum[i] = max;
            }
        }
    }
}
