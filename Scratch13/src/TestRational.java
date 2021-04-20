public class TestRational {
    public static void main(String[] args) {
        Rational r1 = new Rational(-1, 6);
        Rational r2 = new Rational(1, 6);
        System.out.println(r2.compareTo((Rational)r1));
        System.out.println(r1.add(r2));
    }
}
