package case_study.furama_resort.services.interface_service;

import case_study.furama_resort.model.person.Customer;

public interface ICustomerService extends IMainService {
    Customer findById(int id);
    void editCustomer(Customer customer);
}
