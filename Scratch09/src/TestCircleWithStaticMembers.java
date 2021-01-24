public class TestCircleWithStaticMembers {
    public static void main(String[] args) {

        System.out.println("Before creating objects");
        System.out.println("Number of the objects circle is " + CircleWithStaticMembers.numberOfObjects);

        //Create c1
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();

        //Display c1 before c2 is created
        System.out.println("\n After creating c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of the Circle objects ("
                + c1.numberOfObjects + ")");

        //Create c2
        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);

        //Modify c1

        c1.radius = 9;

        // Display c1 and c2 after creating c2
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius +
                ") and number of Circle objects (" + c1.numberOfObjects + ")");
        System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects ("
                + c2.numberOfObjects + ")");
    }
}
 class CircleWithStaticMembers {
    double radius;

    /**   Number of objects created */
     static int numberOfObjects = 0;

     /**   Construct a circle with a radius */
     CircleWithStaticMembers() {
         radius = 1;
         numberOfObjects++;
     }

     /**   Construct a circle with a specified radius */
     CircleWithStaticMembers(double newRadius) {
         radius = newRadius;
         numberOfObjects++;
     }

     /** Return the number of the objects */
     static int getNumberOfObjects() {
         return numberOfObjects;
     }

     /** Return the area of this circle */
     double getArea() {
         return radius * radius * Math.PI;
     }
 }