package case_study.furama_resort.model.facility;

public class Villa extends Facility {
    private String roomStandard;
    private String poolAera;
    private String floorNumber;

    public Villa() {
    }

    public Villa(String serviceName, String usableArea, String rentalCosts, String maximumNumberOfPeople, String rentalType,
                 String serviceCode, String roomStandard, String poolAera, String floorNumber) {
        super(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, serviceCode);
        this.roomStandard = roomStandard;
        this.poolAera = poolAera;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolAera() {
        return poolAera;
    }

    public void setPoolAera(String poolAera) {
        this.poolAera = poolAera;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", poolAera='" + poolAera + '\'' +
                ", floorNumber='" + floorNumber + '\'' +
                "}";
    }

    @Override
    public String toStringCSV() {
        return super.toStringCSV()+","+this.roomStandard+","+this.poolAera+","+this.floorNumber;
    }
}