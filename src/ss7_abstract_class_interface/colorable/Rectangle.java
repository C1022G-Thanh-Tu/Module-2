package ss7_abstract_class_interface.colorable;

public class Rectangle extends Shape implements IColorable {
    private double width, height;
    private String name;

    public Rectangle(String color, boolean filled, double width, double height, String name) {
        super(color, filled);
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public void getArea() {
    System.out.println("Diện tích hình chữ nhật: " + this.width*this.height);
}
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void howToCoLor() {
        if (isFilled()) {
            System.out.println(this.name + ": Color all four sides.");
        } else {
            System.out.println(this.name + ": No color is filled.");
        }
    }
}
