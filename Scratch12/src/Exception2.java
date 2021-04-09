public class Exception2 {
    public static void main(String[] args) {
           try {
            int value = 100;
            if (value < 40) {
                throw new Exception("value is too small");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Continue after the catch block");

        try {
            for (int i = 0; i < 2; i++) {
                System.out.print(i + " ");
                System.out.println(1 / 0);
            }
        }
        catch (Exception exception) {
        }

        System.out.println("Hulala");
    }
}
