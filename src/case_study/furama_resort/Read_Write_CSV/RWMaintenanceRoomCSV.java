package case_study.furama_resort.Read_Write_CSV;

import case_study.furama_resort.model.facility.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class RWMaintenanceRoomCSV {

    public static final String MAINTANANCE_ROOM_CSV = "src\\case_study\\furama_resort\\CSV_Files\\maintanance_room.csv";

    public Map<Room, Integer> readMaintenanceRoomCSV() {
        Map<Room, Integer> maintenanceRoomList = new LinkedHashMap<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(MAINTANANCE_ROOM_CSV));
            String line;
            Room room;
            String[] temp;
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    temp = line.split(",");
                    String serviceName = temp[0];
                    String usableArea = temp[1];
                    String rentalCosts = temp[2];
                    String maximumNumberOfPeople = temp[3];
                    String rentalType = temp[4];
                    String serviceCode = temp[5];
                    String freeService = temp[6];
                    room = new Room(serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,serviceCode,freeService);
                    maintenanceRoomList.put(room,Integer.parseInt(temp[7]));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return maintenanceRoomList;
    }

    public void writeAppendMaintenanceRoomCSV(Map<Room, Integer> maintenanceRoomList) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(MAINTANANCE_ROOM_CSV, true));
            for (Map.Entry<Room, Integer> entry : maintenanceRoomList.entrySet()) {
                bufferedWriter.write(entry.getKey().toStringCSV() + "," + entry.getValue() +"\n");
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeOverrideMaintenanceRoomCSV(Map<Room, Integer> maintenanceRoomList) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(MAINTANANCE_ROOM_CSV));
            for (Map.Entry<Room, Integer> entry : maintenanceRoomList.entrySet()) {
                bufferedWriter.write(entry.getKey().toStringCSV() + "," + entry.getValue() +"\n");
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}