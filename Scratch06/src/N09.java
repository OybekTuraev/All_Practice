public class N09 {
    public static void main(String[] args) {

        final int NUM_OF_CHARS = 175;
        final int PER_LINE = 25;

        // Print between 'a' and 'z' , 25 letter per line
        for (int i = 0; i < NUM_OF_CHARS; i++){
            char ch = getRandomLowercaseLetter();
            if ((i + 1) % PER_LINE == 0){
                System.out.println(ch);
            }
            else {
                System.out.print(ch);
            }
        }
    }

    // Random character between ch1 and ch2

    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    // Random a Lowercase letter

    public static char getRandomLowercaseLetter(){
        return getRandomCharacter('a', 'z');
    }

    // Random a Uppercase Letter

    public static char getRandomUppercaseLetter(){
        return getRandomCharacter('A', 'Z');
    }

    // Random a Digit Character

    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0', '9');
    }

    // Random Character

    public static char getRandomCharacter(){
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
