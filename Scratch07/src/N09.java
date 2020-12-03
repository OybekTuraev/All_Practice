public class N09 {
    public static void main(String[] args) {

        // Counter Letters in Array

        // Declare and Create an array
        char[] chars = createArray();

        // Display the array
        System.out.println("The lowercase letters are:");
        displayArray(chars);

        // Count the occurrences of each letter
        int[] counts = countLetters(chars);

        // Display counts
        System.out.println();
        System.out.println("The occurrence of each letter are:");
        displayCounts(counts);
    }

    public static char[] createArray(){
        char[] chars = new char[5];

        // Create lowercase letters randomly and assign them to array
        for (int i = 0; i < chars.length; i++){
            chars[i] = getRandomLowerCaseLetter();
        }

        return chars;
    }

    public static void displayArray(char[] chars){
        // Display the characters in 20 in each line

        for (int i = 0; i < chars.length; i++){
            if ((i + 1) % 20 == 0){
                System.out.println(chars[i]);
            }
            else {
                System.out.print(chars[i] + " ");
            }
        }
    }

    public static int[] countLetters(char[] chars){
        int[] counts = new int[26];

        // For each lowercase letter int the  array, count it
        for (int i = 0; i < chars.length; i++){
            counts[chars[i] - 'a']++;
        }

        return counts;
    }

    public static void displayCounts(int[] counts){

        for (int i = 0; i < counts.length; i++){
            if ((i + 1) % 10 == 0){
                System.out.println(counts[i] + " " + (char)(i + 'a'));
            }
            else {
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
            }
        }
    }

    public static char getRandomLowerCaseLetter(){

        char ch1 = 'a';
        char ch2 = 'z';

        char randomChar = (char)(Math.random() * (ch2 - ch1 + 1) + ch1);
        return randomChar;
    }
}
