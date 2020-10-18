import java.util.Random;

public class Exercise3_24 {
    public static void main(String[] args){

        /**
         *   Game: pick a card
         */

        Random generator = new Random();

        int rank = (generator.nextInt(13) + 1); // from 1 to 13, 13 included
        //int rank = (int)(Math.random() * (14 - 1) + 1);  // both the same with above one

        int suit = (generator.nextInt(4) + 1);  // from 1 to 4, 4 included

        System.out.print("The card you picked is ");

        switch (rank){
            case 1:
                System.out.print("Ace");
                break;
            case 2:
                System.out.print("rank");
                break;
            case 3:
                System.out.print("rank");
                break;
            case 4:
                System.out.print("rank");
                break;
            case 5:
                System.out.print("rank");
                break;
            case 6:
                System.out.print("rank");
            case 7:
                System.out.print("rank");
                break;
            case 8:
                System.out.print("rank");
                break;
            case 9:
                System.out.print("rank");
                break;
            case 10:
                System.out.print("rank");
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
