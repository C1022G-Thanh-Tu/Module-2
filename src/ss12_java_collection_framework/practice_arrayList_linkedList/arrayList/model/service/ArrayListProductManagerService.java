package ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.service;

import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.model.ArrayListProduct;
import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.repository.IArrayListProductRepository;
import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.repository.ArrayListProductRepository;

public class ArrayListProductManagerService implements IArrayListProductManagerService {
    IArrayListProductRepository repository = new ArrayListProductRepository();

    @Override
    public void addProduct(ArrayListProduct product) {
        repository.addProduct(product);
    }

    @Override
    public void updateProduct(int id, ArrayListProduct product) {
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