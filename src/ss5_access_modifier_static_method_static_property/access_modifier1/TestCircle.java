package ss5_access_modifier_static_method_static_property.access_modifier1;

import ss5_access_modifier_static_method_static_property.access_modifier1.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Bán kính hình tròn: " + circle.getRadius());
        System.out.println("Diện tích hình tròn: " + circle.getArea());
    }
}
