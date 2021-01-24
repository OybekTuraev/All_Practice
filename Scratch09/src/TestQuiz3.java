public class TestQuiz3 {
    public static void main(String[] args) {
        T1 t = new T1();
        swap(t);
        System.out.println("e1 = " + t.e1 + " e2 = " + t.e2);
    }

    public static void swap(T1 t) {
        int temp = t.e1;
        t.e1 = t.e2;
        t.e2 = temp;
    }
}

class T1 {
    int e1 = 1;
    int e2 = 2;
}
