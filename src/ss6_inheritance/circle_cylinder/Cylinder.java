package ss6_inheritance.circle_cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumn() {
        return this.getHeight()*super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + this.getRadius() +
                ", height=" + this.getHeight() +
                ", color='" + this.getColor() +
                ", area='" + getArea() +
                ", volumn='" + getVolumn() + '\'' +
        '}';
    }
}
