package case_study.furama_resort.repository.class_repository;

import case_study.furama_resort.model.facility.Room;
import case_study.furama_resort.model.facility.Villa;
import case_study.furama_resort.repository.interface_repository.IBookingRepository;
import case_study.furama_resort.repository.interface_repository.IFacilityRepository;

import java.util.*;

public class FacilityRepositrory implements IFacilityRepository {
    static IBookingRepository bookingRepository = new BookingRepositrory();
    static Map<Room, Integer> availableRoomList = new LinkedHashMap<>();
    static Map<Villa, Integer> availableVillaList = new LinkedHashMap<>();
    static Map<Room, Integer> maintenanceRoomList = new LinkedHashMap<>();
    static Map<Villa, Integer> maintenanceVillaList = new LinkedHashMap<>();

    static {
        Room room1 = new Room("Thuê phòng", 30, 100000, 5,
                "theo ngày", "ấm nước miễn phí");
        Room room2 = new Room("Thuê phòng", 25, 90000, 4,
                "theo tháng", "trái cây miễn phí");
        Room room3 = new Room("Thuê phòng", 45, 35000, 8,
                "theo năm", "massage miễn phí");
        Villa villa1 = new Villa("Thuê Villa", 200, 500000, 20,
                "Theo ngày", "vip", 20, 3);
        Villa villa2 = new Villa("Thuê Villa", 250, 550000, 22,
                "Theo tháng", "super vip", 25, 3);
        Villa villa3 = new Villa("Thuê Villa", 300, 600000, 25,
                "Theo năm", "ultra vip", 30, 4);
        if (bookingRepository.addNewBooking(room1)) {
            availableRoomList.put(room1, availableRoomList.get(room1) + 1);
        } else {
            availableRoomList.put(room1, 0);
        }
        if (bookingRepository.addNewBooking(room2)) {
            availableRoomList.put(room2, availableRoomList.get(room2) + 1);
        } else {
            availableRoomList.put(room2, 0);
        }
        if (bookingRepository.addNewBooking(room3)) {
            availableRoomList.put(room3, availableRoomList.get(room3) + 1);
        } else {
            availableRoomList.put(room3, 5);
        }
        if (bookingRepository.addNewBooking(villa1)) {
            availableVillaList.put(villa1, availableVillaList.get(villa1) + 1);
        } else {
            availableVillaList.put(villa1, 0);
        }
        if (bookingRepository.addNewBooking(villa2)) {
            availableVillaList.put(villa2, availableVillaList.get(villa2) + 1);
        } else {
            availableVillaList.put(villa2, 5);
        }
        if (bookingRepository.addNewBooking(villa3)) {
            availableVillaList.put(villa3, availableVillaList.get(villa3) + 1);
        } else {
            availableVillaList.put(villa3, 0);
        }
    }


    @Override
    public void createListRoomMaintenance() {

        for (Map.Entry<Room, Integer> entry : availableRoomList.entrySet()) {
            if (entry.getValue() >= 5) {
                maintenanceRoomList.put(entry.getKey(), entry.getValue());
//                availableRoomList.remove(entry);
            }
        }
    }

    @Override
    public void createListVillaMaintenance() {
        for (Map.Entry<Villa, Integer> entry : availableVillaList.entrySet()) {
            if (entry.getValue() >= 5) {
                maintenanceVillaList.put(entry.getKey(), entry.getValue());
//                availableVillaList.remove(entry);
            }
        }

//        for (Villa villaKey : availableVillaList.keySet()) {
//            if (availableVillaList.get(villaKey) >= 5) {
//                maintenanceVillaList.put(villaKey, availableVillaList.get(villaKey));
//            }
//        }
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
        for (Map.Entry<Villa, Integer> villaEntry : availableVillaList.entrySet()) {
            if (villaEntry.getValue() < 5) {
                System.out.println(villaEntry.getKey() + ": " + villaEntry.getValue() + " lần sử dụng");
            }

        }
    }

    @Override
    public void display() {
        for (Map.Entry<Room, Integer> roomEntry : availableRoomList.entrySet()) {
            if (roomEntry.getValue() < 5) {
                System.out.println(roomEntry.getKey() + ": " + roomEntry.getValue() + " lần sử dụng");
            }
        }
    }

    @Override
    public void addNewRoom(Room room) {
        if (bookingRepository.addNewBooking(room)) {
            availableRoomList.put(room, availableRoomList.get(room) + 1);
        } else {
            availableRoomList.put(room, 0);
        }
    }

    @Override
    public void adNewVilla(Villa villa) {
        if (bookingRepository.addNewBooking(villa)) {
            availableVillaList.put(villa, availableVillaList.get(villa) + 1);
        } else {
            availableVillaList.put(villa, 0);
        }
    }

    @Override
    public void add(Object object) {
    }
}