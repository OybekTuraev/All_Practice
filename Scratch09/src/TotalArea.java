public class TotalArea {
    public static void main(String[] args) {
        PrivateDataFields[] circleArray;

        circleArray = createCircleArray();

        printCircleArray(circleArray);
    }

    public static PrivateDataFields[] createCircleArray() {

        PrivateDataFields[] circleArray = new PrivateDataFields[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new PrivateDataFields(Math.random() * 100);
        }

        return circleArray;
    }

    public static void printCircleArray(PrivateDataFields[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++){
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }

        System.out.println("__________________________________");
        System.out.printf("%-30s%-15f\n", "Total area of the circle is ", sum(circleArray));
    }

    public static double sum(PrivateDataFields[] circleArray) {
        double sum = 0;
        for (int i = 0; i < circleArray.length; i++) {
            sum += circleArray[i].getArea();
        }

        return sum;
    }
}
