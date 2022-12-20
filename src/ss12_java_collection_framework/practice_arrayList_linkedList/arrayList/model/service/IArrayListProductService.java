package ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.service;

import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.model.ArrayListProduct;

public interface IArrayListProductService {
    void addProduct(ArrayListProduct product);
    ArrayListProduct updateProduct(ArrayListProduct product);
    void removeProduct(int id);
    void listProduct();
    void searchProduct(String name);
    void sortAscendingOrder();
    void sortDescendingOrder();
    ArrayListProduct findById(int id);
}