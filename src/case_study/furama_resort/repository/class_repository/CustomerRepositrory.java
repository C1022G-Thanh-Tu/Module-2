package case_study.furama_resort.repository.class_repository;

import case_study.furama_resort.model.person.Customer;
import case_study.furama_resort.repository.interface_repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositrory implements ICustomerRepository {
    static List<Customer> customerList = new ArrayList<>();
    static  {
        customerList.add(new Customer("Trần Văn A", "15/09/2000", "nam",
                "124234", "0123912983","tva2000@gmail.com", 1, "Diamond",
                "12 Trần cao Văn"));
        customerList.add(new Customer("Trần Văn B", "26/11/2002", "nam",
                "156743", "09347348","tvb2002@gmail.com", 2, "Silver",
                "278 Lê Đình Lý"));
        customerList.add(new Customer("Trần Văn C", "17/05/1995", "nữ",
                "984854", "09374623","tvc2000@gmail.com", 3, "Gold",
                "1 Hoàng Diệu"));
    }
    @Override
    public Customer findById(int id) {
        for (Customer customer : customerList) {
            if (customer.getCustomerId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void editCustomer(Customer customer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerId() == customer.getCustomerId()) {
                customerList.set(i, customer);
            }
        }
    }

    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add(Object object) {
        Customer customer = (Customer) object;
        customerList.add(customer);
    }
}
