package ss17_io_binary_file_serialization.product_management_binary.model.repository;

import ss17_io_binary_file_serialization.product_management_binary.model.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    public static final String FILE_PATH = "D:\\CODEGYM\\Module2\\C1022G1\\src\\ss17_io_binary_file_serialization\\product_management_binary\\binary.dat";

    public static void writeObjectList(List<Product> productList) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(FILE_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            objectOutputStream.writeObject(productList);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Product> readObjectList() {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(FILE_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            objectInputStream = new ObjectInputStream(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            List<Product> productList = (List<Product>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productList;
    }
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Máy ảnh", "Trung Quốc", 1000000));
        productList.add(new Product(2, "Điện thoại", "Nhật Bản", 950000));
        productList.add(new Product(3, "Laptop", "Pháp", 25000000));
        productList.add(new Product(4, "Tai nghe", "Mỹ", 190000));
        writeObjectList(productList);
    }

    @Override
    public void add(Product product) {
        List<Product> resultList = readObjectList();
        resultList.add(product);
        writeObjectList(resultList);
    }

    @Override
    public void display() {
        List<Product> resultList = readObjectList();
        for (Product product : resultList) {
            System.out.println(product);
        }
        writeObjectList(resultList);
    }

    @Override
    public Product search(String name) {
        List<Product> resultList = readObjectList();
        for (Product product : resultList) {
            if (product.getProductName().contains(name)) {
                writeObjectList(resultList);
                return product;
            }
        }
        return null;
    }
}