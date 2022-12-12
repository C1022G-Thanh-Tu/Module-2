package demo;

public abstract class Vehicle {
    protected String transportation;
    protected Manufacturer manufacturer;

    public Vehicle(String transportation, Manufacturer manufacturer) {
        this.transportation = transportation;
        this.manufacturer = manufacturer;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturerName () {
        return this.manufacturer.getManufacturerName();
    }
    public void start() {
        System.out.println("Bắt đầu");
    }

    public void acceleration () {
        System.out.println("Tăng tốc");
    }

    public void stop() {
        System.out.println("Dừng lại");
    }

    public abstract String getSpeed();
}
