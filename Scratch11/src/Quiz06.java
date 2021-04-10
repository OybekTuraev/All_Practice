public class Quiz06 {
    public static void main(String[] args) {
        new A2();
        new B2();
    }
}

class A2 {
    int i = 7;
    public A2() {
        setI(20);
        System.out.println("i from A2 is " + i);
    }

    public void setI(int i) {
        this.i = 2 * i;
    }
}

class B2 extends A2 {
    public B2() {
        System.out.println("i from B2 is " + i);
    }

    @Override
    public void setI(int i) {
        this.i = 3 * i;
    }
}
