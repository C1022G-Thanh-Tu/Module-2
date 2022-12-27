package case_study.furama_resort.repository.class_repository;

import case_study.furama_resort.model.Booking;
import case_study.furama_resort.model.facility.Room;
import case_study.furama_resort.model.facility.Villa;
import case_study.furama_resort.repository.interface_repository.IBookingRepository;
import case_study.furama_resort.repository.interface_repository.IFacilityRepository;

import java.util.*;

public class FacilityRepositrory implements IFacilityRepository {
//    static IBookingRepository bookingRepository = new BookingRepositrory();

    static Map<Room, Integer> availableRoomList = new LinkedHashMap<>();
    static Map<Villa, Integer> availableVillaList = new LinkedHashMap<>();
    static Map<Room, Integer> maintenanceRoomList = new LinkedHashMap<>();
    static Map<Villa, Integer> maintenanceVillaList = new LinkedHashMap<>();

//    static Set<Booking> bookingSet = bookingRepository.getAllBookingList();
//    static List<Booking> bookingList = (List<Booking>) bookingSet;

    static {
        Room room1 = new Room("Phòng vip", 30, 100000, 5,
                "theo ngày", "SVRO-1234", "ấm nước miễn phí");
        Room room2 = new Room("Phòng thường", 25, 90000, 4,
                "theo tháng", "SVRO-6789", "trái cây miễn phí");
        Room room3 = new Room("Phòng pro vip", 45, 35000, 8,
                "theo năm", "SVRO-5678", "massage miễn phí");
        Villa villa1 = new Villa("Villa vip", 200, 500000, 20,
                "Theo ngày", "SVVL-2345","vip", 20, 3);
        Villa villa2 = new Villa("Villa thường", 250, 550000, 22,
                "Theo tháng", "SVVL-0012","super vip", 25, 3);
        Villa villa3 = new Villa("Villa ultra vip", 300, 600000, 25,
                "Theo năm", "SVVL-8483","ultra vip", 30, 4);

//        for (int i = 0; i < bookingList.size(); i++) {
//            for (Map.Entry<Room, Integer> entry : availableRoomList.entrySet()) {
//                if (bookingList.get(i).getServiceCode().equals(entry.getKey().getServiceCode())) {
//                    availableRoomList.put(room1, availableRoomList.get(room1) + 1);
//                } else {
//                    availableRoomList.put(room1, 0);
//                }
//            }
//        }

        availableRoomList.put(room1, 0);
        availableRoomList.put(room2, 0);
        availableRoomList.put(room3, 5);
        availableVillaList.put(villa1, 0);
        availableVillaList.put(villa2, 5);
        availableVillaList.put(villa3, 0);
    }


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
        for (Map.Entry<Villa, Integer> villaEntry : availableVillaList.entrySet()) {
            System.out.println(villaEntry.getKey() + ": " + villaEntry.getValue() + " lần sử dụng");
        }
    }

    @Override
    public void display() {
        for (Map.Entry<Room, Integer> roomEntry : availableRoomList.entrySet()) {
            System.out.println(roomEntry.getKey() + ": " + roomEntry.getValue() + " lần sử dụng");
        }
    }

    @Override
    public void add(Object object) {
        Room room = (Room) object;
        availableRoomList.put(room, 0);
    }

    @Override
    public void adNewVilla(Villa villa) {
        availableVillaList.put(villa, 0);
    }
}