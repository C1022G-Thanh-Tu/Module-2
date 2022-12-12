package ss7_abstract_class_interface.colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapeArr = new Shape[3];
        shapeArr[0] = new Square("red", true, 5.6, "Hình vuông");
        shapeArr[1] = new Circle("yellow", false, 7.8, "Hình tròn");
        shapeArr[2] = new Rectangle("black", false, 3.6, 9.7, "Hình chữ nhật");
        shapeArr[0].howToCoLor();
        shapeArr[1].howToCoLor();
        shapeArr[2].howToCoLor();
        System.out.println();
        shapeArr[0].getArea();
        shapeArr[1].getArea();
        shapeArr[2].getArea();
    }
}
