package demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static final String FILE_PATH1 = "D:\\CODEGYM\\Module2\\C1022G1\\src\\demo\\test_binary.dat";
    public static final String FILE_PATH2 = "D:\\CODEGYM\\Module2\\C1022G1\\src\\demo\\demo_binary.dat";

    public static void writeObject(Demo demo) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH2);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(demo);
        objectOutputStream.close();
    }

    public static Demo readObject() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(FILE_PATH2);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Demo demo = (Demo) objectInputStream.readObject();
        return demo;
    }

    public static void writeObjectList(List<Demo> demoList) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH1);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(demoList);
        objectOutputStream.close();
    }

    public static List<Demo> readObjectList() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(FILE_PATH1);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Demo> demoList = (List<Demo>) objectInputStream.readObject();
        return demoList;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Demo demo1 = new Demo(1, "Hùng");
        Demo demo2 = new Demo(2, "Tùng");
        Demo demo3 = new Demo(3, "Bảo");
        List<Demo> demoList = new ArrayList<>();
        demoList.add(demo1);
        demoList.add(demo2);
        demoList.add(demo3);
        writeObjectList(demoList);
        List<Demo> resultList = readObjectList();
        for (Demo demo : resultList) {
            System.out.println(demo);
        }
//        writeObject(demo1);
//        System.out.println(readObject());
    }
}
