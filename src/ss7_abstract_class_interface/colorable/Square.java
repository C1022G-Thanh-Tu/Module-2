package ss7_abstract_class_interface.colorable;

public class Square extends Shape implements IColorable {
    private double width;
    private String name;
    public Square(String color, boolean filled, double width, String name) {
        super(color, filled);
        this.width = width;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void getArea(){
        System.out.println("Diện tích hình vuông: " + Math.pow(this.width, 2));
    }

    @Override
    public void howToCoLor() {
        if (isFilled()) {
            System.out.println(this.name + ": Color all four sides.");
        } else {
            System.out.println(this.name + ": No color is filled.");
        }
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }
}
