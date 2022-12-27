package case_study.furama_resort.model.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceName, String usableArea, String rentalCosts, String maximumNumberOfPeople,
                String rentalType, String serviceCode, String freeService) {
        super(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, serviceCode);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maximumNumberOfPeople=" + maximumNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                '}';
    }
}
