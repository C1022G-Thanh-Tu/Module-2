package ss7_abstract_class_interface.resizeable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Shape[] shapeArrray = new Shape[3];
        shapeArrray[0] = new Circle("red", true, 5.6);
        shapeArrray[1] = new Rectangle("black", true, 5.8, 6.7);
        shapeArrray[2]= new Square("blue", false, 4.9);
        System.out.println("Diện tích trước khi thay đổi");
        shapeArrray[0].resize(0);
        shapeArrray[1].resize(0);
        shapeArrray[2].resize(0);
        System.out.println();
        System.out.println("DIện tích sau khi thay đổi");
        shapeArrray[0].resize(Math.floor(Math.random()*100)+1);
        shapeArrray[1].resize(Math.floor(Math.random()*100)+1);
        shapeArrray[2].resize(Math.floor(Math.random()*100)+1);
    }
}