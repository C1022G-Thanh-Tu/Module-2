package demo;

public class Test {
    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("Hãng 1", "Mỹ");
        Manufacturer manufacturer2 = new Manufacturer("Hãng 2", "Úc");
        Plane plane = new Plane("Máy bay", manufacturer1, "Nhiên liệu máy bay");
        Car car = new Car("Ô tô", manufacturer2, "Nhiên liệu ô tô");
        System.out.println(plane);
        System.out.println(car);
        System.out.println(plane.getManufacturerName());
    }

}
