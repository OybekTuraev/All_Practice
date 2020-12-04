public class Exercise7_07 {
    public static void main(String[] args) {

        // Count single digits

        int[] counts = new int[10];

        for (int i = 1; i <= 100; i++){
            counts[(int)(Math.random() * 10)]++;
        }

        for (int i = 0; i < counts.length; i++){
            System.out.println(i + "s: " + counts[i]);
        }
    }
}
