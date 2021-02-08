public class WrapperClass {
    public static void main(String[] args) {

        // Creating a Wrapper class object
        Integer obj = new Integer(100);

        // Converting the wrapper object to primitive
        int num = obj.intValue();
        System.out.println(num + " " + obj);


        //Converting int primitive into Integer object
        int num1 = 100;
        Integer obj1 = Integer.valueOf(num1);
        System.out.println(num + " " + obj);
    }
}
