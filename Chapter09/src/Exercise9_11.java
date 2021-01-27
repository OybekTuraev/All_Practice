import java.util.Scanner;

public class Exercise9_11 {
    public static void main(String[] args) {

        // Test Linear Equation
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a,b,e1,c,d,e2: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double e1 = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e2 = scanner.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, e1, c, d, e2);

        if (equation.isSolvable()) {
            System.out.printf("Answer(x, y): (%.2f, %.2f)%n", equation.getX(), equation.getY());
        }
        else {
            System.out.println("The equation has no solution");
        }
    }
}

class LinearEquation {
    private double a;
    private double b;
    private double e1;
    private double c;
    private double d;
    private double e2;

    LinearEquation(double a, double b, double e1, double c, double d, double e2) {
        this.a = a;
        this.b = b;
        this.e1 = e1;
        this.c = c;
        this.d = d;
        this.e2 = e2;
    }

    /** Getters */
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getE1() {
        return e1;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE2() {
        return e2;
    }

    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        return (e1 * d - b * e2) / (a * d - b * c);
    }

    public double getY() {
        return (a * e2 - e1 * c) / (a * d - b * c);
    }
}
