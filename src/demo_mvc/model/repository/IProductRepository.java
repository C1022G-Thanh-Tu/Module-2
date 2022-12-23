package demo_mvc.model.repository;

import demo_mvc.model.model.Product;

public interface IProductRepository {
    void add(Product product);
    void display();
    Product search (String name);
    void create();
}
