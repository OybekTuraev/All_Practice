public class Exercise9_08 {
    public static void main(String[] args) {

        // Test Fan Class
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn();

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");

        fan1.toString1();
        fan2.toString1();
    }
}

class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    String color;

    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    /** Accessors */
    public String getSpeed() {
        String string = "";

        switch (speed) {
            case SLOW: string = "SLOW";
            break;
            case MEDIUM: string = "MEDIUM";
            break;
            case FAST: string = "FAST";
        }

        return string;
    }

    public boolean isOn () {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    /** Mutators */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn() {
        on = true;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /** toString, all descriptions */
    public void toString1() {
        if (on) {
            System.out.printf("Speed: %d%nColor: %s%nRadius: %.0f%n", speed, color, radius);
        }
        else {
            System.out.printf("%nColor: %s%nRadius: %.0f%nFan is off%n", color, radius);
        }
    }
}
