package case_study.furama_resort.services.class_service;

import case_study.furama_resort.model.facility.Room;
import case_study.furama_resort.model.facility.Villa;
import case_study.furama_resort.repository.class_repository.FacilityRepositrory;
import case_study.furama_resort.repository.interface_repository.IFacilityRepository;
import case_study.furama_resort.services.interface_service.IFacilityService;

public class FacilityService implements IFacilityService {
    IFacilityRepository repository = new FacilityRepositrory();
    @Override
    public void display() {
        repository.display();
    }

    @Override
    public void displayListRoomMaintenance() {
        repository.displayListRoomMaintenance();
    }

    @Override
    public void displayVillaList() {
        repository.displayVillaList();
    }

    @Override
    public void adNewVilla(Villa villa) {
        repository.adNewVilla(villa);
    }

    @Override
    public void createListRoomMaintenance() {
        repository.createListRoomMaintenance();
    }

    @Override
    public void createListVillaMaintenance() {
        repository.createListVillaMaintenance();
    }

    @Override
    public void displayListVillaMaintenance() {
        repository.displayListVillaMaintenance();
    }

    @Override
    public void add(Object object) {
        Room room = (Room) object;
        repository.add(room);
    }
}