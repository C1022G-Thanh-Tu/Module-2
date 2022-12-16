package ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.service;

import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.Product;
import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.repository.IProductRepository;
import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.repository.ProductRepositoryImpl;

public class ProductManagerService implements IProductManagerService {
    IProductRepository repository = new ProductRepositoryImpl();

    @Override
    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    @Override
    public void updateProduct(int id, int index, Product product1, Product product2) {
        repository.updateProduct(id, index, product1, product2);
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
