package ss5_access_modifier_static_method_static_property.access_modifier2;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Tu");
        student1.setClasses("C10");
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());
    }
}
