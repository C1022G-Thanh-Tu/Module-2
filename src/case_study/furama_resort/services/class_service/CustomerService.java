package case_study.furama_resort.services.class_service;

import case_study.furama_resort.model.person.Customer;
import case_study.furama_resort.repository.class_repository.CustomerRepositrory;
import case_study.furama_resort.repository.interface_repository.ICustomerRepository;
import case_study.furama_resort.services.interface_service.ICustomerService;

public class CustomerService implements ICustomerService {
    ICustomerRepository repository = new CustomerRepositrory();
    @Override
    public void display() {
        repository.display();
    }

    @Override
    public void add(Object object) {
        Customer customer = (Customer) object;
        repository.add(customer);
    }

    @Override
    public Customer findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void editCustomer(Customer customer) {
        repository.editCustomer(customer);
    }
}
