package ss17_io_binary_file_serialization.product_management_binary.model.model;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 2L;
    private int productID;
    private String productName;
    private String manufacturer;
    private int price;

    public Product() {
    }

    public Product(int productID, String productName, String manufacturer, int price) {
        this.productID = productID;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
