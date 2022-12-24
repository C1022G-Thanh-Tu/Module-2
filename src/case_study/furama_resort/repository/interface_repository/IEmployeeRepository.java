package case_study.furama_resort.repository.interface_repository;

import case_study.furama_resort.model.person.Employee;

public interface IEmployeeRepository extends IMainRepository{
    Employee findById(int id);
    void deleteEmployee(Employee employee);
    void editEmployee(Employee employee);
}