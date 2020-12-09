import java.util.Scanner;

public class N7 {
    public static void main(String[] args) {

                                   //   Weather

        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;
        double[][][] data = new double[9][23][1];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < NUMBER_OF_DAYS * NUMBER_OF_HOURS; i++){
            int day = scanner.nextInt();
            int hour = scanner.nextInt();
            double temperature = scanner.nextDouble();
            double humidity = scanner.nextDouble();
            data[day - 1][hour - 1][0] = temperature;
            data[day - 1][hour - 1][1] = humidity;
        }

        // Find the average daily temperature and humidity
        for (int i = 0; i < NUMBER_OF_DAYS; i++){

            double dailyTempTotal = 0;
            double dailyHumidTotal = 0;

            for (int j = 0; j < NUMBER_OF_HOURS; j++){

                dailyTempTotal += data[i][j][0];
                dailyHumidTotal += data[i][j][1];
            }

            // Display the result
            System.out.println("Day " + i + "'s average temperature is " + dailyTempTotal / NUMBER_OF_HOURS);
            System.out.println("Day " + i + "'s average humidity is " + dailyHumidTotal / NUMBER_OF_HOURS);
        }
    }
}
