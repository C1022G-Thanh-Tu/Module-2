package demo;

public class Manufacturer {
    private String manufacturerName, countryName;

    public Manufacturer(String manufacturerName, String countryName) {
        this.manufacturerName = manufacturerName;
        this.countryName = countryName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
