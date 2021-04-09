public class Exception4 {
    public static void main(String[] args) {


       try {
           method(5);
       }
       catch (Exception ex) {
           System.out.println(ex.getMessage());
       }
        String ss = "15454654";
        boolean isNumeric = ss.chars().allMatch(Character::isDigit);
    }

    private static void method(int value) throws Exception{

        // Another solution is to add throws Exception in the method header and
        //use try-catch in the calling method to catch the exception
        // Or just using try-catch block here inside this method itself

       if (value > 4) {
           throw new Exception("Incorrect");
       }
    }
}
