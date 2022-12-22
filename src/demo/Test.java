package demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static final String FILE_NAME = "D:\\CODEGYM\\Module2\\C1022G1\\src\\demo\\Demo.csv";

    public static List<Demo> readCSV() throws IOException {
        List<Demo> demoList = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_NAME);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String[] temp;
        Demo demo;
        while ((line = bufferedReader.readLine()) != null) {
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String name = temp[1];
            demo = new Demo(id, name);
            demoList.add(demo);
        }
        return demoList;
    }
    public static void writeCSV(Demo demo) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_NAME, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("\n" + demo.getId() + "," + demo.getName());
        bufferedWriter.close();
    }
    public static void main(String [] args) throws IOException {
//        List<Demo> demoList = readCSV();
//        for (Demo demo : demoList) {
//            System.out.println(demo);
//        }
        writeCSV(new Demo(4, "d"));
    }
}
