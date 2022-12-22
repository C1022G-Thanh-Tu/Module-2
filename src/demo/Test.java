package demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static final String FILE_NAME = "D:\\CODEGYM\\Module2\\C1022G1\\src\\demo\\Demo.csv";
    public static final String TEST_CSV = "D:\\CODEGYM\\Module2\\C1022G1\\src\\demo\\Test.csv";

    public static List<String> readCSV() throws IOException {
        List<String> demoList = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_NAME);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
//        String[] temp;
//        Demo demo;
        while ((line = bufferedReader.readLine()) != null) {
//            temp = line.split(",");
//            int id = Integer.parseInt(temp[0]);
//            String name = temp[1];
//            demo = new Demo(id, name);
            demoList.add(line);
        }
        return demoList;
    }
//    public static void writeCSV(Demo demo) throws IOException {
//        FileWriter fileWriter = new FileWriter(FILE_NAME, true);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write("\n" + demo.getId() + "," + demo.getName());
//        bufferedWriter.close();
//    }
    public static void main(String [] args) throws IOException {
        List<String> demoList = readCSV();
        FileWriter fileWriter = new FileWriter(TEST_CSV);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String s : demoList) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
//        for (Demo demo : demoList) {
//            System.out.println(demo);
//        }
//        writeCSV(new Demo(4, "d"));
    }
}
