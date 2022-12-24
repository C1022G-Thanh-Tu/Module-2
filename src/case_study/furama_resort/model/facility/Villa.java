package case_study.furama_resort.model.facility;

public class Villa extends Facility {
    private String roomStandard;
    private int poolAera;
    private int floorNumber;

    public Villa() {
    }

    public Villa(String serviceName, int usableArea, int rentalCosts, int maximumNumberOfPeople,
                 String rentalType, String roomStandard, int poolAera, int floorNumber) {
        super(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
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

    public int getPoolAera() {
        return poolAera;
    }

    public void setPoolAera(int poolAera) {
        this.poolAera = poolAera;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolAera=" + poolAera +
                ", floorNumber=" + floorNumber +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maximumNumberOfPeople=" + maximumNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
