package ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.repository;

import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.Product;

public interface IProductRepository {
    void addProduct(Product product);
    void updateProduct(int id, Product product);
    void removeProduct(int id);
    void listProduct();
    void searchProduct(String name);
    void sortAscendingOrder();
    void sortDescendingOrder();
}
