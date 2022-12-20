package ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.service;

import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.model.ArrayListProduct;

public interface IArrayListProductService {
    void addProduct(ArrayListProduct product);
    ArrayListProduct updateProduct(ArrayListProduct product);
    boolean removeProduct(ArrayListProduct product);
    void listProduct();
    ArrayListProduct searchProduct(String name);
    void sortAscendingOrder();
    void sortDescendingOrder();
    ArrayListProduct findById(int id);
}