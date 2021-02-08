public class UseBMI {
    public static void main(String[] args) {
        BMI bmi = new BMI("Kim", 18, 145, 70);
        System.out.println("The BMI for " + bmi.getName() + " is " + bmi.getBMI() + " " + bmi.getStatus());

        BMI bmi2 = new BMI("Yang", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
