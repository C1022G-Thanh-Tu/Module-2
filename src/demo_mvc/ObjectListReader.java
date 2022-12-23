package demo_mvc;

import demo_mvc.model.model.Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectListReader {
    public List<Product> readObjectList (final String FILE_PATH) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(FILE_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Product> productList = null;
        try {
            productList = (List<Product>) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }
}
