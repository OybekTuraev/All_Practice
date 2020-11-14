import java.util.Scanner;

public class Exercise4_10 {
    public static void main(String[] args) {

        // Guess Birthday

        String set1 =
                "1   3  5  7\n" +
                "9  11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31";

        String set2 =
                " 2  3  6  7\n" +
                "10 11 14 15\n" +
                "18 19 22 23\n" +
                "26 27 30 31";

        String set3 =
                " 4  5  6  7\n" +
                "12 13 14 15\n" +
                "20 21 22 23\n" +
                "28 29 30 31";

        String set4 =
                " 8  9 10 11\n" +
                "12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31";

        String set5 =
                "16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31";

        int day = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Is your birthday in Set1?");
        System.out.println(set1);
        System.out.print("Enter N for No and Y for Yes: ");
        String answer = scanner.nextLine();
        char ch = answer.charAt(0);

        if (Character.toUpperCase(ch) == 'Y'){
            day +=1;
        }

        System.out.println("\nIs your birthday in Set2?");
        System.out.println(set2);
        System.out.print("Enter N for No and Y for Yes: ");
        answer = scanner.nextLine();
        ch = answer.charAt(0);

        if (Character.toUpperCase(ch) == 'Y'){
            day +=2;
        }

        System.out.println("\nIs your birthday in Set3?");
        System.out.println(set3);
        System.out.print("Enter N for No and Y for Yes: ");
        answer = scanner.nextLine();
        ch = answer.charAt(0);

        if (Character.toUpperCase(ch) == 'Y'){
            day +=4;
        }

        System.out.println("\nIs your birthday in Set4?");
        System.out.println(set4);
        System.out.print("Enter N for No and Y for Yes: ");
        answer = scanner.nextLine();
        ch = answer.charAt(0);

        if (Character.toUpperCase(ch) == 'Y'){
            day +=8;
        }

        System.out.println("\nIs your birthday in Set5?");
        System.out.println(set5);
        System.out.print("Enter 0 for No and 1 for Yes: ");
        answer = scanner.nextLine();
        ch = answer.charAt(0);

        if (Character.toUpperCase(ch) == 'Y'){
            day +=16;
        }

        System.out.println("\nYour birthday is " + day + "!");
    }
}
