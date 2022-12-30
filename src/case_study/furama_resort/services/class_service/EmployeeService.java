package case_study.furama_resort.services.class_service;

import case_study.furama_resort.model.person.Employee;
import case_study.furama_resort.repository.class_repository.EmployeeRepositrory;
import case_study.furama_resort.repository.interface_repository.IEmployeeRepository;
import case_study.furama_resort.services.interface_service.IEmployeeService;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository repository = new EmployeeRepositrory();
    @Override
    public Employee findById(String id) {
        return repository.findById(id);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        repository.deleteEmployee(employee);
    }

    @Override
    public void editEmployee(Employee employee) {
        repository.editEmployee(employee);
    }

    @Override
    public void display() {
        repository.display();
    }

    @Override
    public void add(Object object) {
        Employee employee = (Employee) object;
        repository.add(employee);
    }
}
