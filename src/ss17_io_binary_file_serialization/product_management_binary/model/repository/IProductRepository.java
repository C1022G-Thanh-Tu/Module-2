package ss17_io_binary_file_serialization.product_management_binary.model.repository;

import ss17_io_binary_file_serialization.product_management_binary.model.model.Product;

public interface IProductRepository {
    void add (Product product);
    void display ();
    Product search (String name);
}
