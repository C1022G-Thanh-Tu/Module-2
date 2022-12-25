package case_study.furama_resort.services.interface_service;

import case_study.furama_resort.model.facility.Room;
import case_study.furama_resort.model.facility.Villa;

public interface IFacilityService extends IMainService {
    void displayListRoomMaintenance();
    void displayVillaList();
    void addNewRoom(Room room);
    void adNewVilla(Villa villa);
    void createListRoomMaintenance();
    void createListVillaMaintenance();
    void displayListVillaMaintenance();
}
