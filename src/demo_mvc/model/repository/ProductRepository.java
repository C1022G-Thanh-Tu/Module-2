package demo_mvc.model.repository;

import demo_mvc.ObjectListReader;
import demo_mvc.ObjectListWriter;
import demo_mvc.model.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    public static final String FILE_NAME = "D:\\CODEGYM\\Module2\\C1022G1\\src\\demo_mvc\\test.dat";
    ObjectListReader objectListReader = new ObjectListReader();
    ObjectListWriter objectListWriter = new ObjectListWriter();
    static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1, "Máy ảnh", "Trung Quốc", 1000000));
    }
    @Override
    public void create() {
        objectListWriter.writeObjectList(productList, FILE_NAME);
    }

    @Override
    public void add(Product product) {
        List<Product> resultList = objectListReader.readObjectList(FILE_NAME);
        resultList.add(product);
        objectListWriter.writeObjectList(resultList, FILE_NAME);
    }

    @Override
    public void display() {
        List<Product> resultList = objectListReader.readObjectList(FILE_NAME);
        for (Product product : resultList) {
            System.out.println(product);
        }
        objectListWriter.writeObjectList(resultList, FILE_NAME);

    }

    @Override
    public Product search(String name) {
        List<Product> resultList = objectListReader.readObjectList(FILE_NAME);
        for (Product product : resultList) {
            if (product.getProductName().contains(name)) {
                return product;
            }
        }
        objectListWriter.writeObjectList(resultList, FILE_NAME);
        return null;
    }
}
