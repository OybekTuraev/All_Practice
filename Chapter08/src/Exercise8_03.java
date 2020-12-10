public class Exercise8_03 {
    public static void main(String[] args) {

              // Sort students o grades

        char[][] answersOfStudents = {
                {'A', 'B', 'B', 'E', 'A', 'A', 'B', 'D', 'A', 'A'},
                {'A', 'A', 'B', 'A', 'A', 'E', 'A', 'C', 'A', 'A'},
                {'D', 'A', 'C', 'D', 'A', 'A', 'A', 'A', 'A', 'A'},
                {'D', 'A', 'B', 'A', 'C', 'A', 'E', 'B', 'A', 'C'},
                {'B', 'B', 'E', 'A', 'A', 'C', 'A', 'A', 'B', 'D'},
                {'A', 'A', 'D', 'A', 'E', 'D', 'A', 'C', 'A', 'E'},
                {'B', 'B', 'C', 'A', 'C', 'B', 'D', 'C', 'A', 'D'},
                {'C', 'A', 'A', 'A', 'A', 'A', 'E', 'B', 'D', 'C'},
        };

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Chek every student
        int[] correctCount = new int[8];

        for (int i = 0; i < answersOfStudents.length; i++){
            for (int j = 0; j < answersOfStudents[i].length; j++){
                if (answersOfStudents[i][j] == keys[j]){
                    correctCount[i]++;
                }
            }
        }

        sort(correctCount);

        for (int i = 0; i < correctCount.length; i++){

            System.out.println("Student " + i + "'s correct answers is " + correctCount[i]);
        }
    }

    public static void sort(int[] array){

        for (int i = 0; i < array.length; i++){
            // Finding the lowest value
            int min = 0;
            int minIndex = 0;

            if (min > array[i]){
                min = array[i];
                minIndex = i;
            }

            //Swap
            if (minIndex != i){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
