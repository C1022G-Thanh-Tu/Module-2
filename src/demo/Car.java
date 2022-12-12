package demo;

public class Car extends Vehicle {
    private String fuelType;

    public Car(String transportation, Manufacturer manufacturer, String fuelType) {
        super(transportation, manufacturer);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String getSpeed() {
        return 70 + "km/h";
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelType='" + fuelType + '\'' +
                ", transportation='" + transportation + '\'' +
                ", manufacturer=" + manufacturer +
                ", vận tốc=" + getSpeed() +
                '}';
    }
}
