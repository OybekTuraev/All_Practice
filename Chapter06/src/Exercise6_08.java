public class Exercise6_08 {
    public static void main(String[] args) {

        // Conversions between Celsius and Fahrenheit

        showTable();
    }

    public static void showTable(){

        System.out.println("Celsius     Fahrenheit    |    Fahrenheit      Celsius ");
        System.out.println("------------------------------------------------------------");

        for (double celsius = 40, fahrenheit = 120; celsius >= 31; celsius--, fahrenheit -= 10){

            System.out.printf("%-12.1f%-14.1f|", celsius, celsiusToFahrenheit(celsius));
            System.out.printf("%10.1f%15.2f", fahrenheit, fahrenheitToCelsius(fahrenheit));
            System.out.println();
        }
    }

    public static double celsiusToFahrenheit(double celsius){

        double fahrenheit = 0;
        fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit){

        double celsius = 0;
        celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
