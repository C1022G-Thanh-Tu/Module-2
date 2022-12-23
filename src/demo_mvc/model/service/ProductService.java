package demo_mvc.model.service;

import demo_mvc.model.repository.IProductRepository;
import demo_mvc.model.repository.ProductRepository;
import demo_mvc.model.model.Product;

public class ProductService implements IProductService{
    IProductRepository productRepository = new ProductRepository();
    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void display() {
        productRepository.display();
    }

    @Override
    public Product search(String name) {
        return productRepository.search(name);
    }

    @Override
    public void create() {
        productRepository.create();
    }
}
