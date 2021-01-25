public class TestQuiz6 {
    public static void main(String[] args) {
        // Wrong thing is here that : Line 4 prints null since dates[0]
        // is null. Line 5 causes a NullPointerException since it invokes toString() method from the null reference.)
        java.util.Date[] dates = new java.util.Date[10];
        System.out.println(dates[0]);
        System.out.println(dates[0].toString());
    }
}
