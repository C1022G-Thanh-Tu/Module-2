package case_study.furama_resort.Read_Write_CSV;

import case_study.furama_resort.model.facility.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class RWAvailableRoomCSV {

    public static final String AVAILABLE_ROOM_CSV = "D:\\CODEGYM\\Module2\\C1022G1\\src\\case_study\\furama_resort\\CSV_Files\\available_room.csv";

    public Map<Room, Integer> readAvailableRoomCSV() {
        Map<Room, Integer> availableRoomList = new LinkedHashMap<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(AVAILABLE_ROOM_CSV));
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
                    availableRoomList.put(room,Integer.parseInt(temp[7]));
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
        return availableRoomList;
    }

    public void writeAppendAvailableRoomCSV(Map<Room, Integer> availableRoomList) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(AVAILABLE_ROOM_CSV, true));
            for (Map.Entry<Room, Integer> entry : availableRoomList.entrySet()) {
                bufferedWriter.write(entry.getKey().toStringCSV() + "," + entry.getValue());
            }
            bufferedWriter.flush();
            bufferedWriter.newLine();
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

    public void writeOverrideAvailableRoomCSV(Map<Room, Integer> availableRoomList) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(AVAILABLE_ROOM_CSV));
            for (Map.Entry<Room, Integer> entry : availableRoomList.entrySet()) {
                bufferedWriter.write(entry.getKey().toStringCSV() + "," + entry.getValue());
            }
            bufferedWriter.flush();
            bufferedWriter.newLine();
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
