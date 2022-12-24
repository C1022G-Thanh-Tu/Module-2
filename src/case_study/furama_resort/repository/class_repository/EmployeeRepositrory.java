package case_study.furama_resort.repository.class_repository;

import case_study.furama_resort.model.person.Employee;
import case_study.furama_resort.repository.interface_repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositrory implements IEmployeeRepository {
    static List<Employee> employeeList = new ArrayList<>();
    static {
        employeeList.add(new Employee("Nguyễn Văn A", "26/07/1998", "Nam" ,
                "201750900", "091301145", "nva1998@gmail.com", 1,
                "Đại học", "Kế toán", 100000));
        employeeList.add(new Employee("Nguyễn Văn B", "20/08/1999", "Nam" ,
                "201238189", "034983472","nvb1999@gmail.com", 2,
                "Đại học", "Quản lý", 200000));
        employeeList.add(new Employee("Nguyễn Văn C", "12/12/2001", "Nữ" ,
                "139813812", "0129938423","nvc2001@gmail.com", 3,
                "Cao đẳng", "Phục vụ", 100000));
    }
    @Override
    public Employee findById(int id) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeId() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void deleteEmployee(Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeId() == employee.getEmployeeId()) {
                employeeList.remove(employeeList.get(i));
            }
        }
    }

    @Override
    public void editEmployee(Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeId() == employee.getEmployeeId()) {
                employeeList.set(i, employee);
            }
        }
    }

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add(Object object) {
        Employee employee = (Employee) object;
        employeeList.add(employee);
    }
}
