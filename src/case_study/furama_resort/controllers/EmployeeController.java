package case_study.furama_resort.controllers;

import case_study.furama_resort.model.person.Employee;
import case_study.furama_resort.services.class_service.EmployeeService;
import case_study.furama_resort.services.interface_service.IEmployeeService;

import java.util.Scanner;

public class EmployeeController {
    public void employeeControl() {
        IEmployeeService service = new EmployeeService();
        Scanner scanner = new Scanner(System.in);
        int choiceEmployeeService = 0;
        do {
            System.out.println("---Employee Management---\n"
                    + "1. Display list employees\n"
                    + "2. Add new employee\n"
                    + "3. Delete employee\n"
                    + "4. Edit employee\n"
                    + "5. Return main menu");
            System.out.print("Hãy chọn dịch vụ: ");
            choiceEmployeeService = Integer.parseInt(scanner.nextLine());
            switch (choiceEmployeeService) {
                case 1:
                    service.display();
                    break;
                case 2:
                    System.out.print("Hãy nhập tên của nhân viên mới: ");
                    String newEmployeeFullName = scanner.nextLine();
                    System.out.print("Hãy nhập ngày sinh của nhân viên mới: ");
                    String newEmployeeDateOfBirth = scanner.nextLine();
                    System.out.print("Hãy nhập giới tính của nhân viên mới: ");
                    String newEmployeeGender = scanner.nextLine();
                    System.out.print("Hãy nhập số CMND của nhân viên mới: ");
                    String newEmployeePhoneNumber = scanner.nextLine();
                    System.out.print("Hãy nhập số điện thoại của nhân viên mới: ");
                    String newEmployeeIdentityNumber = scanner.nextLine();
                    System.out.print("Hãy nhập email của nhân viên mới: ");
                    String newEmployeeEmail = scanner.nextLine();
                    System.out.print("Hãy nhập id của nhân viên mới: ");
                    int newEmployeeId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Hãy nhập trình độ học vấn của nhân viên mới: ");
                    String newEmployeeAcademicLevel = scanner.nextLine();
                    System.out.print("Hãy nhập vị trí của nhân viên mới: ");
                    String newEmployeeWoringPosition = scanner.nextLine();
                    System.out.print("Hãy nhập lương của nhân viên mới: ");
                    int newEmployeeSalary = Integer.parseInt(scanner.nextLine());
                    service.add(new Employee(newEmployeeFullName, newEmployeeDateOfBirth, newEmployeeGender,
                            newEmployeeIdentityNumber, newEmployeePhoneNumber, newEmployeeEmail, newEmployeeId, newEmployeeAcademicLevel,
                            newEmployeeWoringPosition, newEmployeeSalary));
                    break;
                case 3:
                    System.out.print("Hãy nhập id của nhân viên muốn xóa: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    Employee employee = service.findById(id);
                    if (employee!=null) {
                        service.deleteEmployee(employee);
                    } else {
                        System.out.println("Hãy nhập đúng id");
                    }
                    break;
                case 4:
                    System.out.print("Hãy nhập id của nhân viên muốn điều chỉnh: ");
                    id = Integer.parseInt(scanner.nextLine());
                    Employee employee1 = service.findById(id);
                    if (employee1!=null) {
                        int choiceEditEmployee = 0;
                        do {
                            System.out.println("---Các thông tin có thể sửa---\n" +
                                    "1. Tên\n" +
                                    "2. Ngày sinh\n" +
                                    "3. Giới tính\n" +
                                    "4. Số CMND\n" +
                                    "5. Số điện thoại\n" +
                                    "6. Email\n" +
                                    "7. Học vấn\n" +
                                    "8. Vị trí\n" +
                                    "9. lương");
                            System.out.print("Hãy nhập thông tin bạn muốn sửa: ");
                            choiceEditEmployee = Integer.parseInt(scanner.nextLine());
                            switch (choiceEditEmployee) {
                                case 1:
                                    System.out.print("Hãy nhập tên mới: ");
                                    String newName = scanner.nextLine();
                                    employee1.setFullName(newName);
                                    break;
                                case 2:
                                    System.out.print("Hãy nhập ngày sinh mới: ");
                                    String newDateOfBirth = scanner.nextLine();
                                    employee1.setDateOfBirth(newDateOfBirth);
                                    break;
                                case 3:
                                    System.out.print("Hãy nhập giới tính mới: ");
                                    String newGender = scanner.nextLine();
                                    employee1.setGender(newGender);
                                    break;
                                case 4:
                                    System.out.print("Hãy nhập số CMND mới: ");
                                    String newIndentityNumber = scanner.nextLine();
                                    employee1.setIndentityCardNumber(newIndentityNumber);
                                    break;
                                case 5:
                                    System.out.print("Hãy nhập số điện thoại mới: ");
                                    String newPhoneNumber = scanner.nextLine();
                                    employee1.setPhoneNumber(newPhoneNumber);
                                    break;
                                case 6:
                                    System.out.print("Hãy nhập email mới: ");
                                    String newEmail = scanner.nextLine();
                                    employee1.setEmail(newEmail);
                                    break;
                                case 7:
                                    System.out.print("Hãy nhập trình độ học vấn mới: ");
                                    String newAcademicLevel = scanner.nextLine();
                                    employee1.setAcademicLevel(newAcademicLevel);
                                    break;
                                case 8:
                                    System.out.print("Hãy nhập vị trí mới: ");
                                    String newWorkingPosition = scanner.nextLine();
                                    employee1.setWorkingPosition(newWorkingPosition);
                                    break;
                                case 9:
                                    System.out.print("Hãy nhập lương mới: ");
                                    int newSalary = Integer.parseInt(scanner.nextLine());
                                    employee1.setSalary(newSalary);
                                    break;
                            }
                        } while (choiceEditEmployee <10);
                        service.editEmployee(employee1);
                    } else {
                        System.out.println("Hãy nhập đúng id");
                    }
                    break;
            }
        } while (choiceEmployeeService != 5) ;
    }
}
