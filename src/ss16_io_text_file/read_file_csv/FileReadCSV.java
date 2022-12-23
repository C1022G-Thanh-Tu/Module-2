package ss16_io_text_file.read_file_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReadCSV {

    public static final String FILE_NAME = "D:\\CODEGYM\\Module2\\C1022G1\\src\\ss16_io_text_file\\read_file_csv\\national_list.csv";

    public static List<Nation> readCSV() throws IOException {
        List<Nation> nationList = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_NAME);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String[] temp;
        Nation nation;
        while ((line = bufferedReader.readLine()) != null) {
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String shortName = temp[1];
            String fullName = temp[2];
            nation = new Nation(id,shortName, fullName);
            nationList.add(nation);
        }
        bufferedReader.close();
        return nationList;
    }

    public static void main(String[] args) throws IOException {
        List<Nation> nationList = readCSV();
        for (Nation nation : nationList) {
            System.out.println(nation);
        }
    }
}
