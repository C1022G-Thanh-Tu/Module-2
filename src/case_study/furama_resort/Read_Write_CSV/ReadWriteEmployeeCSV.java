package case_study.furama_resort.Read_Write_CSV;

import case_study.furama_resort.model.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteEmployeeCSV {

    public static final String FILE_EMPLOYEE_CSV = "D:\\CODEGYM\\Module2\\C1022G1\\src\\case_study\\furama_resort\\CSV_Files\\employee.csv";

    public List<Employee> readEmployeeCSV() {
        List<Employee> employeeList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(FILE_EMPLOYEE_CSV));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] temp;
        String line;
        Employee employee;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String fullName = temp[0];
                String dateOfBirth = temp[1];
                String gender = temp[2];
                String indentityCardNumber = temp[3];
                String phoneNumber = temp[4];
                String email = temp[5];
                int employeeId = Integer.parseInt(temp[6]);
                String academicLevel = temp[7];
                String workingPosition = temp[8];
                int salary = Integer.parseInt(temp[9]);
                employee = new Employee(fullName, dateOfBirth, gender, indentityCardNumber, phoneNumber, email, employeeId,
                        academicLevel, workingPosition, salary);
                employeeList.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return employeeList;
    }


    public void writeEmployeeCSV(List<Employee> employeeList) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(FILE_EMPLOYEE_CSV));
            for (Employee employee : employeeList) {
                try {
                    bufferedWriter.write(employee.getFullName() + "," + employee.getDateOfBirth() + "," + employee.getGender()
                            + "," + employee.getIndentityCardNumber() + "," + employee.getPhoneNumber() + "," + employee.getEmail()
                            + "," + employee.getEmployeeId() + "," + employee.getAcademicLevel() + "," + employee.getWorkingPosition()
                            + "," + employee.getSalary() + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}