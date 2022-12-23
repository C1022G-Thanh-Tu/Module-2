package ss17_io_binary_file_serialization.product_management_binary.model.service;

import ss17_io_binary_file_serialization.product_management_binary.model.model.Product;

public interface IProductService {
    void add (Product product);
    void display ();
    Product search (String name);
}
