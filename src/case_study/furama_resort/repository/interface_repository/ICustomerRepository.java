package case_study.furama_resort.repository.interface_repository;

import case_study.furama_resort.model.person.Customer;

import java.util.List;

public interface ICustomerRepository extends IMainRepository{
    List<Customer> getAllCustomers();
    Customer findById(int id);
    void editCustomer(Customer customer);
}
