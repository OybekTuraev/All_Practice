public class Exception4 {
    public static void main(String[] args) {
        method(5);
    }

    private static void method(int value) {

        // Another solution is to add throws Exception in the method header and
        //use try-catch in the calling method to catch the exception

       try {
           if (value > 4) {
                throw new Exception("Incorrect");
           }
       }
       catch (Exception ex) {
           System.out.println(ex.getMessage());
       }

    }
}
