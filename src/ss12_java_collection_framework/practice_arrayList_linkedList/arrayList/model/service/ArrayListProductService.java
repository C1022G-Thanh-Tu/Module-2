package ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.service;

import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.model.ArrayListProduct;
import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.repository.IArrayListProductRepository;
import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.repository.ArrayListProductRepository;

public class ArrayListProductService implements IArrayListProductService {
    IArrayListProductRepository repository = new ArrayListProductRepository();

    @Override
    public void addProduct(ArrayListProduct product) {
        repository.addProduct(product);
    }

    @Override
    public ArrayListProduct updateProduct(ArrayListProduct product) {
        return repository.updateProduct(product);
    }

    @Override
    public boolean removeProduct(ArrayListProduct product) {
        return repository.removeProduct(product);
    }

    @Override
    public void listProduct() {
        repository.listProduct();
    }

    @Override
    public ArrayListProduct searchProduct(String name) {
        return repository.searchProduct(name);
    }

    @Override
    public void sortAscendingOrder() {
        repository.sortAscendingOrder();
    }

    @Override
    public void sortDescendingOrder() {
        repository.sortDescendingOrder();
    }

    @Override
    public ArrayListProduct findById(int id) {
        return repository.findById(id);
    }
}