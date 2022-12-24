package case_study.furama_resort.services.interface_service;

import case_study.furama_resort.model.person.Employee;

public interface IEmployeeService extends IMainService {
    Employee findById(int id);
    void deleteEmployee(Employee employee);
    void editEmployee(Employee employee);
}
