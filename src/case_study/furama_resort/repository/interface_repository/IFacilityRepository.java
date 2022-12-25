package case_study.furama_resort.repository.interface_repository;

import case_study.furama_resort.model.facility.Room;
import case_study.furama_resort.model.facility.Villa;

public interface IFacilityRepository extends IMainRepository{
    void displayListRoomMaintenance();
    void displayVillaList();
    void addNewRoom(Room room);
    void adNewVilla(Villa villa);
    void createListRoomMaintenance();
    void createListVillaMaintenance();
    void displayListVillaMaintenance();
}