package ss7_abstract_class_interface.resizeable;

public class Square extends Shape implements IResizeable {
    private double width;

    public Square(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area of square= " + Math.pow((this.width + this.width*percent), 2));
    }
}