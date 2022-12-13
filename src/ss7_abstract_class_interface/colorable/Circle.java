package ss7_abstract_class_interface.colorable;

public class Circle extends Shape {
    private double radius;
    private String name;
    public Circle(String color, boolean filled, double radius, String name) {
        super(color, filled);
        this.radius = radius;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void getArea() {
        System.out.println("Diện tích hình tròn: " + Math.pow(this.radius, 2)*Math.PI);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
