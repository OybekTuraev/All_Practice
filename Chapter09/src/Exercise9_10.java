import java.util.Scanner;

public class Exercise9_10 {
    public static void main(String[] args) {

        // Test Quadratic Equations
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the values for a,b,c: ");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        if (equation.getDiscriminant() > 0) {
            System.out.printf("Two roots: %.2f and %.2f%n", equation.getRoot1(), equation.getRoot2());
        }
        else if (equation.getDiscriminant() == 0) {
            System.out.printf("One root: %.2f%n", equation.getRoot1());
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /** Getters */
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        else {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        }
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        else {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        }
    }
}
