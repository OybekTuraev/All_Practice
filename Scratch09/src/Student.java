class Student {
    String name;
    int age;
    boolean isScienceMajor;
    char gender;

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name? " + student.name);
        System.out.println("Age? " + student.age);
        System.out.println("Major? " + student.isScienceMajor);
        System.out.println("Gender? " + student.gender);
    }
}

