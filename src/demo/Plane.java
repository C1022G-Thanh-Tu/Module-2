package demo;

import java.util.Objects;

public class Plane extends Vehicle {
    private String fuelType;

    public Plane(String transportation, Manufacturer manufacturer, String fuelType) {
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
        return 500 + "km/h";
    }

    public String takeOff () {
        return "Cất cánh";
    }

    public String landing() {
        return "Hạ cánh";
    }

    @Override
    public String toString() {
        return "Plane{" +
                "fuelType='" + fuelType + '\'' +
                ", transportation='" + transportation + '\'' +
                ", manufacturer=" + manufacturer +
                ", vận tốc=" + getSpeed() + ", " + takeOff() + ", " + landing() +
                '}';
    }
}
