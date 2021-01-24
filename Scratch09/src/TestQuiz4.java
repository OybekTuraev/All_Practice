public class TestQuiz4 {
    public static void main(String[] args) {
        T t1 = new T();
        T t2 = new T();
        //T t3 = new T();

        System.out.println("t1's i = " + T.i + " and j = " + t1.j);
        System.out.println("t2's i = " + T.i + " and j = " + t2.j);
    }
}

class T {
    static int i = 0;
    int j = 0;

    //i is incremented each time when a new object is created
    T() {
        i++;
        j = 1;
    }
}
