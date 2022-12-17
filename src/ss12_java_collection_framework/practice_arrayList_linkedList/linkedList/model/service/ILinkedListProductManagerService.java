package ss12_java_collection_framework.practice_arrayList_linkedList.linkedList.model.service;

import ss12_java_collection_framework.practice_arrayList_linkedList.linkedList.model.model.LinkedListProduct;

public interface ILinkedListProductManagerService {
    void addProduct(LinkedListProduct product);
    void updateProduct(int id, LinkedListProduct product);
    void removeProduct(int id);
    void listProduct();
    void searchProduct(String name);
    void sortAscendingOrder();
    void sortDescendingOrder();
}
