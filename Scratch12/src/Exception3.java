public class Exception3 {
    public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException in main");
        }
        catch (Exception ex) {
            System.out.println("Exception in main");
        }
    }

    static void method() throws Exception {
        try {
            String s = "abc";
            System.out.println(s.charAt(3));
        }
        catch (RuntimeException ex) {
            // handle it here, if cannot pass it to the main
            System.out.println("RuntimeException in method");
        }
        catch (Exception ex) {
            System.out.println("Exception in method");
        }
    }
}
