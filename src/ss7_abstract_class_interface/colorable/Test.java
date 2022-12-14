package ss7_abstract_class_interface.colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapeArr = new Shape[3];
        shapeArr[0] = new Square("red", true, 5.6, "Hình vuông");
        shapeArr[1] = new Circle("yellow", false, 7.8, "Hình tròn");
        shapeArr[2] = new Rectangle("black", false, 3.6, 9.7, "Hình chữ nhật");
        for (Shape shape : shapeArr) {
            if (shape instanceof Square) {
                Square square = (Square) shapeArr[0];
                square.howToCoLor();
                square.getArea();
                System.out.println();
            } else if (shape instanceof Circle) {
                Circle circle = (Circle) shapeArr[1];
                circle.getArea();
                System.out.println();
            } else {
                Rectangle rectangle = (Rectangle) shapeArr[2];
                rectangle.getArea();
            }
        }
    }
}