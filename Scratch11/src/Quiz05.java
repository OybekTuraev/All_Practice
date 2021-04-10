public class Quiz05 {
    public static void main(String[] args) {
        A1 a = new A1(3);
    }
}

// Every parent class's no-arg constructor is invoked from the beginning order

class A1 extends B1 {
    public A1(int n) {
        System.out.println("A1's constructor");
    }
}

class B1 {
    public B1() {
        System.out.println("B1's constructor");
    }
}
