package demo_simple;

import case_study.furama_resort.model.facility.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static Map<Demo, Integer> readCSV() throws IOException {
        Map<Demo, Integer> demoIntegerMap = new LinkedHashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\CODEGYM\\Module2\\C1022G1\\src\\demo_simple\\Test.csv"));
        String line;
        Demo demo;
        String[] temp;
        while ((line = bufferedReader.readLine()) != null) {
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String name = temp[1];
            int value = Integer.parseInt(temp[2]);
            demo = new Demo(id, name);
            demoIntegerMap.put(demo, value);
        }
        return demoIntegerMap;
    }

    public static void writeCSV(Map<Demo, Integer> demoIntegerMap) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\CODEGYM\\Module2\\C1022G1\\src\\demo_simple\\Test.csv"));
        for (Map.Entry<Demo, Integer> entry : demoIntegerMap.entrySet()) {
            bufferedWriter.write(entry.getKey().toStringCSV() + "," + entry.getValue());
        }
        bufferedWriter.flush();
    }

    public static void main(String[] args) throws IOException {
        Map<Demo, Integer> demoIntegerMap = new LinkedHashMap<>();
        demoIntegerMap.put(new Demo(1, "A"), 0);
        demoIntegerMap.put(new Demo(2, "B"), 1);
        writeCSV(demoIntegerMap);
    }
}