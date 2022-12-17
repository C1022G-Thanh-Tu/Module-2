package ss12_java_collection_framework.practice_arrayList_linkedList.linkedList.model.repository;

import ss12_java_collection_framework.practice_arrayList_linkedList.linkedList.model.model.LinkedListProduct;
import ss12_java_collection_framework.practice_arrayList_linkedList.linkedList.model.repository.ILinkedListProductRepository;

import java.util.*;

public class LinkedListProductRepository implements ILinkedListProductRepository {
    List<LinkedListProduct> productList = new LinkedList<>();
    LinkedListProduct product1 = new LinkedListProduct(2, "Máy ảnh", 1000000);
    LinkedListProduct product2 = new LinkedListProduct(1, "Điện thoại", 1200000);
    LinkedListProduct product3 = new LinkedListProduct(4, "Laptop", 3000000);
    LinkedListProduct product4 = new LinkedListProduct(3, "Bàn phím", 1500000);
    public LinkedListProductRepository(){
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
    }
    @Override
    public void addProduct(LinkedListProduct product) {
        productList.add(product);
    }

    @Override
    public void updateProduct(int id, LinkedListProduct product) {
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
        for (LinkedListProduct product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct(String name) {
        for (LinkedListProduct product : productList) {
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