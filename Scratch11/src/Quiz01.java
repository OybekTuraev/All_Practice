public class Quiz01 {
    public static void main(String[] args) {
        new B(); // to call constructor
    }
}

class A {
    // The point is to have always no-arg constructor
    public A() {
    }

    public A(int x) {
    }
}

class B extends A {
    public B() {
    }
}




