package case_study.furama_resort.model.facility;

public abstract class Facility {
    private String serviceName;
    private String usableArea;
    private String rentalCosts;
    private String maximumNumberOfPeople;
    private String rentalType;
    private String serviceCode;

    public Facility() {
    }

    public Facility(String serviceName, String usableArea, String rentalCosts, String maximumNumberOfPeople,
                    String rentalType, String serviceCode) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(String maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return  "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maximumNumberOfPeople=" + maximumNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                ", serviceCode='" + serviceCode + '\'';
    }

    public String toStringCSV() {
        return this.serviceName+","+this.usableArea+","+this.rentalCosts+","+this.maximumNumberOfPeople+","+
                this.rentalType+","+this.serviceCode;
    }
}