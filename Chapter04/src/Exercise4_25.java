public class Exercise4_25 {
    public static void main(String[] args){

        // Generate vehicle plate numbers

        // Generating Uppercase letters, starting from A = 65, to Z = 90,

        char letter1 = (char)(Math.random() * 26 + 65);
        char letter2 = (char)(Math.random() * 26 + 65);
        char letter3 = (char)(Math.random() * 26 + 65);

        // Generating four numbers

        int digit1 = (int)(Math.random() * 10);
        int digit2 = (int)(Math.random() * 10);
        int digit3 = (int)(Math.random() * 10);
        int digit4 = (int)(Math.random() * 10);

        System.out.printf("The vehicle plate number is %c%c%c%d%d%d%n",
                letter1, letter2, letter3, digit1, digit2, digit3, digit4);
    }
}
