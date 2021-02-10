public class MyInteger {
    private int value;

    MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return !(value % 2 == 0);
    }

    public static boolean isPrime(int value) {
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return myInteger.value == this.value;
    }

    public static int parseInt(char[] arrayChar) {
        int[] intValues = new int[arrayChar.length];
        String string = "";
        for (int i = 0; i < arrayChar.length; i++) {
            intValues[i] = Integer.parseInt(String.valueOf(arrayChar[i]));
            string += intValues[i];
        }

        return Integer.parseInt(string);
    }

    public static int parseInt(String string) {
        return Integer.parseInt(string);
    }
}
