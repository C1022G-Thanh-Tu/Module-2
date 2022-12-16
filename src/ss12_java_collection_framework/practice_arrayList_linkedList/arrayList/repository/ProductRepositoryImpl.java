package ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.repository;

import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.Product;

import java.util.*;

public class ProductRepositoryImpl implements IProductRepository {
    List<Product> productList = new ArrayList<>();
    Product product1 = new Product(2, 1000000, "Máy ảnh");
    Product product2 = new Product(1, 1200000, "Điện thoại");
    Product product3 = new Product(3, 3000000, "Laptop");
    public ProductRepositoryImpl(){
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }
    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void updateProduct(int id, int index, Product product1, Product product2) {
        if (product2.getId() == id) {
            productList.set(index, product1);
        }
    }

    @Override
    public void removeProduct(int id) {
        for (int i = 0; i<productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(productList.get(i));
            }
        }
    }

    @Override
    public void listProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void sortAscendingOrder() {
        Collections.sort(productList);
    }

    @Override
    public void sortDescendingOrder() {
        Collections.sort(productList);
        Collections.reverse(productList);
    }
}
