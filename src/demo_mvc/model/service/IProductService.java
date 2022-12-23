package demo_mvc.model.service;

import demo_mvc.model.model.Product;

public interface IProductService {
    void add(Product product);
    void display();
    Product search (String name);
    void create();
}
