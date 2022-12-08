package ss5_access_modifier_static_method_static_property.access_modifier2;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Tu");
        student.setClasses("C10");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
        System.out.println(student);
    }
}
