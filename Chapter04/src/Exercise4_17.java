import java.util.Scanner;

public class Exercise4_17 {
    public static void main(String[] args){

        // Days of a month

        Scanner scanner = new Scanner(System.in);

        // Do not use String , netLine after nextInt and others like this
        System.out.print("Enter a year: ");
        String year = scanner.nextLine();
        System.out.print("Enter a month: ");
        String month = scanner.nextLine();

        int year1 = Integer.parseInt(year);

        switch (month){
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                System.out.printf("%s %d has 31 days%n", month, year1);
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                System.out.printf("%s %d has 30 days%n", month, year1);
                break;
            case "Feb":
                System.out.printf(((year1 % 4 == 0 && year1 % 100 != 0) || year1 % 400 == 0) ?
                        "%s %d has 29 days%n" : "%s %d has 28 days%n", month, year1);
                break;
            default:
                System.out.println("Invalid input");
       }
    }
}
