package ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.repository;

import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.model.ArrayListProduct;

import java.util.*;

public class ArrayListProductRepository implements IArrayListProductRepository {
    public static List<ArrayListProduct> productList = new ArrayList<>();
    ArrayListProduct product1 = new ArrayListProduct(1, "Máy ảnh", 1000000);
    ArrayListProduct product2 = new ArrayListProduct(2, "Điện thoại", 1200000);
    ArrayListProduct product3 = new ArrayListProduct(3, "Laptop", 3000000);
    ArrayListProduct product4 = new ArrayListProduct(4, "Bàn phím", 1500000);

    public ArrayListProductRepository() {
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
    }

    @Override
    public void addProduct(ArrayListProduct product) {
        productList.add(product);
    }

    @Override
    public void updateProduct(int id, ArrayListProduct product) {
        for (int i = 0; i<productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.set(productList.indexOf(productList.get(i)), product);
            }
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
        for (ArrayListProduct product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct(String name) {
        for (ArrayListProduct product : productList) {
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