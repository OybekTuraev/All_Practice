public class TestCircleWithExceptionChecked {
    public static void main(String[] args) {

        try {
            new CircleWithExceptionChecked(5);
            new CircleWithExceptionChecked(-5);
            new CircleWithExceptionChecked(0);
        }
        catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }

        System.out.println("Number of objects created is " + CircleWithExceptionChecked.getNumberOfObjects());
    }
}
