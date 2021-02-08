public class Builder {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java");
        StringBuilder s2 = new StringBuilder("go");
        System.out.println(s1.substring(2));
        System.out.println(s1.insert(1, "hulala"));
        System.out.println(s1.reverse());
    }
}
