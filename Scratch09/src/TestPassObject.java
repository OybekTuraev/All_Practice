public class TestPassObject {
    public static void main(String[] args) {

        PrivateDataFields myCircle = new PrivateDataFields(1);
        int n = 5;
        printCircle(myCircle, n);

        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }

    public static void printCircle(PrivateDataFields c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
