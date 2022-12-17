package ss12_java_collection_framework.practice_arrayList_linkedList.linkedList.model.service;

import ss12_java_collection_framework.practice_arrayList_linkedList.linkedList.model.model.LinkedListProduct;
import ss12_java_collection_framework.practice_arrayList_linkedList.linkedList.model.repository.ILinkedListProductRepository;
import ss12_java_collection_framework.practice_arrayList_linkedList.linkedList.model.repository.LinkedListProductRepository;

public class LinkedListProductManagerService implements ILinkedListProductManagerService {
    ILinkedListProductRepository repository = new LinkedListProductRepository();

    @Override
    public void addProduct(LinkedListProduct product) {
        repository.addProduct(product);
    }

    @Override
    public void updateProduct(int id, LinkedListProduct product) {
        repository.updateProduct(id, product);
    }

    @Override
    public void removeProduct(int id) {
        repository.removeProduct(id);
    }

    @Override
    public void listProduct() {
        repository.listProduct();
    }

    @Override
    public void searchProduct(String name) {
        repository.searchProduct(name);
    }

    @Override
    public void sortAscendingOrder() {
        repository.sortAscendingOrder();
    }

    @Override
    public void sortDescendingOrder() {
        repository.sortDescendingOrder();
    }
}