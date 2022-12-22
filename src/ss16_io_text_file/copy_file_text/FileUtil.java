package ss16_io_text_file.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public static final String FILE_NAME1 = "D:\\CODEGYM\\Module2\\C1022G1\\src\\ss16_io_text_file\\copy_file_text\\source_file.csv";
    public static final String FILE_NAME2 = "D:\\CODEGYM\\Module2\\C1022G1\\src\\ss16_io_text_file\\copy_file_text\\target_file.csv";

    public static List<String> readAndWriteCSV() {
        List<String> listArr = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line;
        int count = 0;

        try {
            fileReader = new FileReader(FILE_NAME1);
            bufferedReader = new BufferedReader(fileReader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            while ((line = bufferedReader.readLine()) != null) {
                listArr.add(line);
                count += line.length();
            }
            System.out.println("Số các ký tự đã sao chép là: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listArr;
    }

    public static void main(String[] args) {
        List<String> stringList = readAndWriteCSV();
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_NAME2);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            for (String str : stringList) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
