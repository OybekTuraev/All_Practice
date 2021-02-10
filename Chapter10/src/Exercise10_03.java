public class Exercise10_03 {
    public static void main(String[] args) {
        int[] check = {6, 9, 7, 4, 3};

        // Test isEven, isOdd, isPrime
        for (int i = 0; i < check.length; i++) {
            System.out.println(check[i] + " is even? " + MyInteger.isEven(check[i]));
        }

        for (int i = 0; i < check.length; i++) {
            System.out.println(check[i] + " is odd? " + MyInteger.isOdd(check[i]));
        }

        for (int i = 0; i < check.length; i++) {
            System.out.println(check[i] + " is prime? " + MyInteger.isPrime(check[i]));
        }

        for (int i = 0; i < check.length; i++) {
            MyInteger myInteger = new MyInteger(check[i]);
            System.out.println(myInteger.getValue() + " is even? " + myInteger.isEven());
        }

        for (int i = 0; i < check.length; i++) {
            MyInteger myInteger = new MyInteger(check[i]);
            System.out.println(myInteger.getValue() + " is odd? " + myInteger.isOdd());
        }

        for (int i = 0; i < check.length; i++) {
            MyInteger myInteger = new MyInteger(check[i]);
            System.out.println(myInteger.getValue() + " is prime? " + myInteger.isPrime());
        }

        for (int i = 0; i < check.length; i++) {
            MyInteger myInteger = new MyInteger(check[i]);
            System.out.println(myInteger.getValue() + " is even? " + MyInteger.isEven(myInteger));
        }

        for (int i = 0; i < check.length; i++) {
            MyInteger myInteger = new MyInteger(check[i]);
            System.out.println(myInteger.getValue() + " is odd? " + MyInteger.isOdd(myInteger));
        }

        for (int i = 0; i < check.length; i++) {
            MyInteger myInteger = new MyInteger(check[i]);
            System.out.println(myInteger.getValue() + " is prime? " + MyInteger.isPrime(myInteger));
        }

        char[] chars = {'1', '2', '4'};
        String strings = "129";

        System.out.println(MyInteger.parseInt(chars));
        System.out.println(MyInteger.parseInt(strings));

    }
}
