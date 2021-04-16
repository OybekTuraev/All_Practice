import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the URL: ");
        String url = scanner.nextLine();
        crawler(url);                                                 // craw from this URL
    }

    public static void crawler(String startingURL) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty() &&
                listOfTraversedURLs.size() <= 100) {
            String urlString = listOfPendingURLs.remove(0);      // get the first URL
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);                   // URL traversed
                System.out.println("Craw " + urlString);

                for (String s : getSubURLs(urlString)) {
                    if (listOfTraversedURLs.contains(s)) {
                        listOfPendingURLs.add(s);                     // add a new URL
                    }
                }
            }
        }
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            Scanner scanner = new Scanner(url.openStream());
            int current = 0;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                current = line.indexOf("http:", current);            //search for URL
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);      // end of URL // URL ends with "
                    if (endIndex > 0) {                                  // Ensure that a correct URL is found
                        list.add(line.substring(current, endIndex));     // extract URL
                        current = line.indexOf("http:", endIndex);   //search fro the next URL
                    }
                    else {
                        current = -1;
                    }
                }
            }
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return list;
    }
}
