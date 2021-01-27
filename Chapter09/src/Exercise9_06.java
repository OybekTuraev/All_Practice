import javafx.scene.paint.Stop;

public class Exercise9_06 {
    public static void main(String[] args) {

        // Test StopWatch
        StopWatch stopWatch = new StopWatch();

        // Array of numbers
        int[] array = getArray();

        // Start the time
        stopWatch.start();

        // Sort Array
        sortArray(array);

        // Stop the time
        stopWatch.stop();

        // Display
        System.out.println("The execution time for sorting is " +
                stopWatch.getElapsedTime() + " milliseconds");
    }

    public static int[] getArray() {
        final int NUMBERS = 10;
        int[] array = new int[NUMBERS];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * NUMBERS);
        }

        return array;
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length - 1; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                array[minIndex] = array[i]; // here they exchange their values, like in position of 5, the value of position of 2 replaces
                array[i] = min;
            }
        }
    }
}

class StopWatch {

    // Private data fields or states
    private long startTime;
    private long endTime;

    // Initialize in constructor
    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    // Set startTime to the currentTime
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Set endTime to the currentTime
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Taking how much time spent
    public long getElapsedTime() {
        return getEndTime() - getStartTime();
    }

    // Returning startTime because of being private
    public long getStartTime() {
        return startTime;
    }

    // Returning endTime as well
    public long getEndTime() {
        return endTime;
    }
}