public class Exercise9_02 {
    public static void main(String[] args) {

        // Test Program for Stock
        Stock object = new Stock("ORCL", "Oracle Corporation", 35);
        object.setCurrentPrice(34);

        System.out.printf("Price-Change Percentage is %.2f%%%n", object.getChangePercent());
    }
}

    // Stock Class
class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String symbol, String name, double prevPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = prevPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
       return Math.abs((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
