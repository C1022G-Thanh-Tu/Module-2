package case_study.furama_resort.Read_Write_CSV;

import case_study.furama_resort.model.facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class RWMaintenanceVillaCSV {

    public static final String MAINTANANCE_VILLA_CSV = "src\\case_study\\furama_resort\\CSV_Files\\maintanance_villa.csv";

    public Map<Villa, Integer> readMaintenanceVillaCSV() {
        Map<Villa, Integer> maintenancelVillaList = new LinkedHashMap<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(MAINTANANCE_VILLA_CSV));
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
                    villa = new Villa(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, serviceCode
                            , roomStandard, poolAera, floorNumber);
                    maintenancelVillaList.put(villa, Integer.parseInt(temp[9]));
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
        return maintenancelVillaList;
    }

    public void writeApppendMaintenanceVillaCSV(Map<Villa, Integer> maintenancelVillaList) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(MAINTANANCE_VILLA_CSV, true));
            for (Map.Entry<Villa, Integer> entry : maintenancelVillaList.entrySet()) {
                bufferedWriter.write(entry.getKey().toStringCSV() + "," + entry.getValue() + "\n");
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

    public void writeOverrideMaintenanceVillaCSV(Map<Villa, Integer> maintenancelVillaList) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(MAINTANANCE_VILLA_CSV));
            for (Map.Entry<Villa, Integer> entry : maintenancelVillaList.entrySet()) {
                bufferedWriter.write(entry.getKey().toStringCSV() + "," + entry.getValue() + "\n");
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
