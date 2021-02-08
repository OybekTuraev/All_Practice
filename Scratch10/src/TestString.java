public class TestString {
    public static void main(String[] args) {
        String s = "Welcome to Java";
        String b = s.replace("o", "T");
        System.out.println(b);
        String n = s.replaceAll("o", "T");
        System.out.println(n);
        String m = s.replaceFirst("o", "T");
        System.out.println(m);

        String s1 = "Welcome";
        String s2 = "welcome";
        s2 = s1.replace('e', 'E');
        String[] tokens = "Welcome to Java and HTML".split(" ");
        s1 = tokens[0];
        s2 = tokens[1];
    }
}
