import java.util.Random;

public class Exercise3_24 {
    public static void main(String[] args){

        /**
         *   Game: pick a card
         */

        Random generator = new Random();

        int rank = (generator.nextInt(13) + 1); // from 1 to 13, 13 included

        //int min = 2;
        //int max = 22;
                         // range = max - min + 1;
        //int range = 22 - 2 + 1;
        //int generator1 = (int)((Math.random() * range) + min);

        int suit = (generator.nextInt(4) + 1);  // from 1 to 4, 4 included

        System.out.print("The card you picked is ");

        switch (rank){
            case 1:
                System.out.print("Ace");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.print(rank);
                break;
            case 11:
                System.out.print("King");
                break;
            case 12:
                System.out.print("Queen");
                break;
            case 13:
                System.out.print("Jack");
                break;
        }

        System.out.print(" of ");

        switch (suit){
            case 1:
                System.out.println("Clubs");
                break;
            case 2:
                System.out.println("Diamonds");
                break;
            case 3:
                System.out.println("Hearts");
                break;
            case 4:
                System.out.println("Spades");
                break;
        }
    }
}
