package ss16_io_text_file.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtil {
    public static List<String> readCSV(final String FILE_NAME1) throws IOException {
        List<String> listArr = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_NAME1);
            bufferedReader = new BufferedReader(fileReader);
        } catch (IOException e) {
            throw new IOException(e);
        }

        String line;
        int count = 0;
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

    public static void writeCSV(List<String> stringList, final String FILE_NAME2) throws IOException {
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
            throw new IOException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập link file cần đọc: ");
            final String FILE_PATH1 = scanner.nextLine();
            System.out.print("Nhập link file cần viết: ");
            final String FILE_PATH2 = scanner.nextLine();
            List<String> stringList = readCSV(FILE_PATH1);
            writeCSV(stringList, FILE_PATH2);
        } catch (IOException e) {
            System.out.println("Nhập sai đường link");
        }

    }
}