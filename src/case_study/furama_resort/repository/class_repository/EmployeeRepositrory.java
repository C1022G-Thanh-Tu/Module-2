package case_study.furama_resort.repository.class_repository;

import case_study.furama_resort.Read_Write_CSV.RWEmployeeCSV;
import case_study.furama_resort.model.person.Employee;
import case_study.furama_resort.repository.interface_repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositrory implements IEmployeeRepository {
    static RWEmployeeCSV readWriteEmployeeCSV = new RWEmployeeCSV();
    static List<Employee> employeeList = new ArrayList<>();

    @Override
    public Employee findById(int id) {
        List<Employee> employeeList1 = readWriteEmployeeCSV.readEmployeeCSV();
        for (Employee employee : employeeList1) {
            if (employee.getEmployeeId() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void deleteEmployee(Employee employee) {
        List<Employee> employeeList1 = readWriteEmployeeCSV.readEmployeeCSV();
        for (int i = 0; i < employeeList1.size(); i++) {
            if (employeeList1.get(i).getEmployeeId() == employee.getEmployeeId()) {
                employeeList1.remove(employeeList1.get(i));
            }
        }
        readWriteEmployeeCSV.writeOverrideEmployeeCSV(employeeList1);
    }

    @Override
    public void editEmployee(Employee employee) {
        List<Employee> employeeList1 = readWriteEmployeeCSV.readEmployeeCSV();
        for (int i = 0; i < employeeList1.size(); i++) {
            if (employeeList1.get(i).getEmployeeId() == employee.getEmployeeId()) {
                employeeList1.set(i, employee);
            }
        }
        readWriteEmployeeCSV.writeOverrideEmployeeCSV(employeeList1);
    }

    @Override
    public void display() {
        List<Employee> employeeList1 = readWriteEmployeeCSV.readEmployeeCSV();
        for (Employee employee : employeeList1) {
            System.out.println(employee);
        }
    }

    @Override
    public void add(Object object) {
        Employee employee = (Employee) object;
        employeeList.add(employee);
        readWriteEmployeeCSV.writeAppendEmployeeCSV(employeeList);
        employeeList.clear();
    }
}
