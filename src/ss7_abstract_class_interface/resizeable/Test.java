package ss7_abstract_class_interface.resizeable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[3];
        shapeArray[0] = new Circle("red", true, 5.6);
        shapeArray[1] = new Rectangle("black", true, 5.8, 6.7);
        shapeArray[2]= new Square("blue", false, 4.9);
        for (int i=0; i< shapeArray.length; i++) {
            if (shapeArray[i] instanceof Circle) {
                Circle circle = (Circle) shapeArray[0];
                System.out.println("Diện tích hình tròn trước khi thay đổi");
                circle.resize(0);
                System.out.println("Diện tích hình tròn sau khi thay đổi");
                circle.resize((Math.floor(Math.random()*100)+1)/100);
                System.out.println();
            } else if (shapeArray[i] instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shapeArray[1];
                System.out.println("Diện tích hình chữ nhật trước khi thay đổi");
                rectangle.resize(0);
                System.out.println("Diện tích hình chữ nhật sau khi thay đổi");
                rectangle.resize((Math.floor(Math.random()*100)+1)/100);
                System.out.println();
            } else {
                Square square = (Square) shapeArray[2];
                System.out.println("Diện tích hình vuông trước khi thay đổi");
                square.resize(0);
                System.out.println("Diện tích hình vuông sau khi thay đổi");
                square.resize((Math.floor(Math.random()*100)+1)/100);
            }
        }
    }
}