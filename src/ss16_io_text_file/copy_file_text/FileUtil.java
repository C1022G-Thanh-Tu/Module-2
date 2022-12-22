package ss16_io_text_file.copy_file_text;

import java.io.*;
import java.util.List;

public class FileUtil {
    public static final String FILE_NAME1 = "D:\\CODEGYM\\Module2\\C1022G1\\src\\ss16_io_text_file\\copy_file_text\\source_file.csv";
    public static final String FILE_NAME2 = "D:\\CODEGYM\\Module2\\C1022G1\\src\\ss16_io_text_file\\copy_file_text\\target_file.csv";

    public static void readAndWriteCSV() {
        FileReader fileReader = null;
        BufferedReader bufferedReader1 = null;

        try {
            fileReader = new FileReader(FILE_NAME1);
            bufferedReader1 = new BufferedReader(fileReader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int character = 0;
        int count = 0;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_NAME2);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while ((character = bufferedReader1.read()) != -1) {
                bufferedWriter.write(character);
                count++;
            }
            bufferedWriter.flush();
            System.out.println("Số các ký tự đã sao chép là: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        readAndWriteCSV();
    }
}