package case_study.furama_resort.Read_Write_CSV;

import case_study.furama_resort.model.facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class RWAvailableVillaCSV {

    public static final String AVAILABLE_VILLA_CSV = "D:\\CODEGYM\\Module2\\C1022G1\\src\\case_study\\furama_resort\\CSV_Files\\available_villa.csv";

    public Map<Villa, Integer> readAvailableVillaCSV() {
        Map<Villa, Integer> availabelVillaList = new LinkedHashMap<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(AVAILABLE_VILLA_CSV));
            String line;
            Villa villa;
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
                    String roomStandard = temp[6];
                    String poolAera = temp[7];
                    String floorNumber = temp[8];
                    villa = new Villa(serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,serviceCode
                    , roomStandard, poolAera, floorNumber);
                    availabelVillaList.put(villa,Integer.parseInt(temp[9]));
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
        return availabelVillaList;
    }

    public void writeAppendAvailableVillaCSV(Map<Villa, Integer> availabelVillaList) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(AVAILABLE_VILLA_CSV, true));
            for (Map.Entry<Villa, Integer> entry : availabelVillaList.entrySet()) {
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

    public void writeOverrideAvailableRoomCSV(Map<Villa, Integer> availableRoomList) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(AVAILABLE_VILLA_CSV));
            for (Map.Entry<Villa, Integer> entry : availableRoomList.entrySet()) {
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
