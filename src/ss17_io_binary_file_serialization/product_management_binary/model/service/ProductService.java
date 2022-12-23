package ss17_io_binary_file_serialization.product_management_binary.model.service;

import ss17_io_binary_file_serialization.product_management_binary.model.model.Product;
import ss17_io_binary_file_serialization.product_management_binary.model.repository.IProductRepository;
import ss17_io_binary_file_serialization.product_management_binary.model.repository.ProductRepository;

public class ProductService implements IProductService{
    IProductRepository productRepository = new ProductRepository();

    public ProductService() {
    }

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
}
