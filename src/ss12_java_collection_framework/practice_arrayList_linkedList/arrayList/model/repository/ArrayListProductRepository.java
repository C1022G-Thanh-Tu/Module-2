package ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.repository;

import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.model.ArrayListProduct;

import java.util.*;

public class ArrayListProductRepository implements IArrayListProductRepository {
    List<ArrayListProduct> productList = new ArrayList<>();
    ArrayListProduct product1 = new ArrayListProduct(2, 1000000, "Máy ảnh");
    ArrayListProduct product2 = new ArrayListProduct(1, 1200000, "Điện thoại");
    ArrayListProduct product3 = new ArrayListProduct(3, 3000000, "Laptop");
    public ArrayListProductRepository(){
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
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
