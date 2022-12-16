package ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.repository;

import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.Product;

public interface IProductRepository {
    void addProduct(Product product);
    void updateProduct(int id, int index, Product product1, Product product2);
    void removeProduct(int id);
    void listProduct();
    void searchProduct(String name);
    void sortAscendingOrder();
    void sortDescendingOrder();
}
