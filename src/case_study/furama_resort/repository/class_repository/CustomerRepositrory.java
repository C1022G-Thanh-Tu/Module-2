package case_study.furama_resort.repository.class_repository;

import case_study.furama_resort.Read_Write_CSV.ReadWriteCustomerCSV;
import case_study.furama_resort.model.person.Customer;
import case_study.furama_resort.repository.interface_repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositrory implements ICustomerRepository {
    static List<Customer> customerList = new ArrayList<>();
    static ReadWriteCustomerCSV readWriteCustomerCSV = new ReadWriteCustomerCSV();

    @Override
    public Customer findById(int id) {
        List<Customer> customerList1 = readWriteCustomerCSV.readCustomerCSV();
        for (Customer customer : customerList1) {
            if (customer.getCustomerId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void editCustomer(Customer customer) {
        List<Customer> customerList1 = readWriteCustomerCSV.readCustomerCSV();
        for (int i = 0; i < customerList1.size(); i++) {
            if (customerList1.get(i).getCustomerId() == customer.getCustomerId()) {
                customerList1.set(i, customer);
            }
        }
        readWriteCustomerCSV.writeCustomer(customerList1);
    }

    @Override
    public void display() {
        List<Customer> customerList1 = readWriteCustomerCSV.readCustomerCSV();
        for (Customer customer : customerList1) {
            System.out.println(customer);
        }
    }

    @Override
    public void add(Object object) {
        Customer customer = (Customer) object;
        if (customerList == null) {
            customerList.add(customer);
            readWriteCustomerCSV.writeCustomer(customerList);
        } else {
            List<Customer> customerList1 = readWriteCustomerCSV.readCustomerCSV();
            customerList1.add(customer);
            readWriteCustomerCSV.writeCustomer(customerList1);
        }

    }
}
