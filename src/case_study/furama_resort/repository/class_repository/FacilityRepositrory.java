package case_study.furama_resort.repository.class_repository;

import case_study.furama_resort.Read_Write_CSV.RWAvailableRoomCSV;
import case_study.furama_resort.Read_Write_CSV.RWAvailableVillaCSV;
import case_study.furama_resort.model.facility.Room;
import case_study.furama_resort.model.facility.Villa;
import case_study.furama_resort.repository.interface_repository.IFacilityRepository;

import java.util.*;

public class FacilityRepositrory implements IFacilityRepository {
    RWAvailableRoomCSV rwAvailableRoomCSV = new RWAvailableRoomCSV();
    RWAvailableVillaCSV rwAvailableVillaCSV = new RWAvailableVillaCSV();
//    static IBookingRepository bookingRepository = new BookingRepositrory();

    static Map<Room, Integer> availableRoomList = new LinkedHashMap<>();
    static Map<Villa, Integer> availableVillaList = new LinkedHashMap<>();
    static Map<Room, Integer> maintenanceRoomList = new LinkedHashMap<>();
    static Map<Villa, Integer> maintenanceVillaList = new LinkedHashMap<>();

//    static Set<Booking> bookingSet = bookingRepository.getAllBookingList();
//    static List<Booking> bookingList = (List<Booking>) bookingSet;

    @Override
    public void createListRoomMaintenance() {
        List<Room> roomList = new ArrayList<>();
        for (Map.Entry<Room, Integer> entry : availableRoomList.entrySet()) {
            if (entry.getValue() >= 5) {
                maintenanceRoomList.put(entry.getKey(), entry.getValue());
                roomList.add(entry.getKey());
            }
        }
        for (int i = 0; i < roomList.size(); i++) {
            availableRoomList.remove(roomList.get(i));
        }
    }

    @Override
    public void createListVillaMaintenance() {
        List<Villa> villaList = new ArrayList<>();
        for (Map.Entry<Villa, Integer> entry : availableVillaList.entrySet()) {
            if (entry.getValue() >= 5) {
                maintenanceVillaList.put(entry.getKey(), entry.getValue());
                villaList.add(entry.getKey());
            }
        }
        for (int i = 0; i < villaList.size(); i++) {
            availableVillaList.remove(villaList.get(i));
        }
    }

    @Override
    public void displayListVillaMaintenance() {
        for (Map.Entry<Villa, Integer> entry : maintenanceVillaList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " lần sử dụng");
        }
    }

    @Override
    public void displayListRoomMaintenance() {
        for (Map.Entry<Room, Integer> entry : maintenanceRoomList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " lần sử dụng");
        }
    }

    @Override
    public void displayVillaList() {
        Map<Villa, Integer> availableVillaList1 = rwAvailableVillaCSV.readAvailableVillaCSV();
        for (Map.Entry<Villa, Integer> villaEntry : availableVillaList1.entrySet()) {
            System.out.println(villaEntry.getKey() + ": " + villaEntry.getValue() + " lần sử dụng");
        }
    }

    // display room
    @Override
    public void display() {
        Map<Room, Integer> availableRoomList1 = rwAvailableRoomCSV.readAvailableRoomCSV();
        for (Map.Entry<Room, Integer> roomEntry : availableRoomList1.entrySet()) {
            System.out.println(roomEntry.getKey() + ":" + roomEntry.getValue() + " lần sử dụng");
        }
    }

    //add room
    @Override
    public void add(Object object) {
        Room room = (Room) object;
        availableRoomList.put(room, 0);
        rwAvailableRoomCSV.writeAppendAvailableRoomCSV(availableRoomList);
        availableRoomList.clear();
    }

    @Override
    public void adNewVilla(Villa villa) {
        availableVillaList.put(villa, 0);
        rwAvailableVillaCSV.writeAppendAvailableVillaCSV(availableVillaList);
        availableVillaList.clear();
    }
}