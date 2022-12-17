package ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.repository;


import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.model.ArrayListProduct;

public interface IArrayListProductRepository {
    void addProduct(ArrayListProduct product);
    void updateProduct(int id, ArrayListProduct product);
    void removeProduct(int id);
    void listProduct();
    void searchProduct(String name);
    void sortAscendingOrder();
    void sortDescendingOrder();
}
