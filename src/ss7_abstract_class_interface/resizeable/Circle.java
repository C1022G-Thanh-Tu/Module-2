package ss7_abstract_class_interface.resizeable;

public class Circle extends Shape implements IResizeable {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println(+ (this.radius+this.radius*percent)*
                (this.radius+this.radius*percent)*Math.PI);
    }
}
