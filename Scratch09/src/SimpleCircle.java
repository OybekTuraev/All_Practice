public class SimpleCircle {
    public static void main(String[] args) {
        // Create a circle with a radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("Radius of the circle1 is " + circle1.radius + " area is " + circle1.getArea());

        //Create a circle with radius specified
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("Radius of the circle2 is " + circle2.radius + " area is " + circle2.getArea());

        //Create a circle with radius specified2
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("Radius of the circle3 is " + circle3.radius + " area is " + circle3.getArea());

        //Modify the circle radius
        circle2.radius = 100;
        System.out.println("Radius of the new circle2 is " + circle2.radius + " area is " + circle2.getArea());
    }

    double radius;

    //Construct a circle with a radius 1
    SimpleCircle(){
        radius = 1;
    }

    //Construct a circle with a specified radius
    SimpleCircle(double newRadius){
        radius = newRadius;
    }

    //Return the area of the circle
    double getArea(){
        return radius * radius * Math.PI;
    }

    //Return the parameter of the circle
    double getParameter(){
        return 2 * radius * Math.PI;
    }

    //Set a new radius for the new circle
    void setRadius(double newRadius){
        radius = newRadius;
    }
}
