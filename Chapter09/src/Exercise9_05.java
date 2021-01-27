import java.util.GregorianCalendar;

public class Exercise9_05 {
    public static void main(String[] args) {

        // Use the Gregorian Calendar
        // Current Time
        GregorianCalendar object = new GregorianCalendar();
        System.out.printf("Year >> %d%nMonth >> %d%nDay >> %d%n", object.get(GregorianCalendar.YEAR)
        , object.get(GregorianCalendar.MONTH), object.get(GregorianCalendar.DAY_OF_MONTH));

        // Specified Time
        object.setTimeInMillis(1234567898765L);
        System.out.printf("%nYear >> %d%nMonth >> %d%nDay >> %d%n", object.get(GregorianCalendar.YEAR)
                , object.get(GregorianCalendar.MONTH), object.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
