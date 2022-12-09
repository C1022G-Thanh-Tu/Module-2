package ss6_inheritance.circle_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0, "red");
        Cylinder cylinder = new Cylinder(3.0, "yellow", 6.0);
        System.out.println(circle);
        System.out.println(cylinder);
    }
}
