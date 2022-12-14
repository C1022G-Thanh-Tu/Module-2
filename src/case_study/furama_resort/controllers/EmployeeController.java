package case_study.furama_resort.controllers;

import case_study.furama_resort.model.person.Employee;
import case_study.furama_resort.services.class_service.EmployeeService;
import case_study.furama_resort.services.interface_service.IEmployeeService;
import case_study.furama_resort.utils.NotFoundException;

import java.util.Scanner;

public class EmployeeController {
    public void controlEmployee() {
        IEmployeeService service = new EmployeeService();
        Scanner scanner = new Scanner(System.in);
        int choiceEmployeeService = 0;
        do {
            System.out.println("---Hệ thống quản lý nhân viên---\n"
                    + "1. Hiển thị danh sách nhân viên\n"
                    + "2. Thêm nhân viên mới\n"
                    + "3. Xóa nhân viên\n"
                    + "4. Điều chỉnh nhân viên\n"
                    + "5. Về menu chính");
            System.out.print("Hãy chọn dịch vụ: ");
            try {
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
                        String newEmployeeId = scanner.nextLine();
                        String newEmployeeAcademicLevel = "";
                        int choiceEmployeeAcademicLevel;
                        boolean flagAcademicLevel;
                        do {
                            flagAcademicLevel = false;
                            System.out.println("Hãy nhập trình độ học vấn của nhân viên mới");
                            System.out.println("----Các trình độ học vấn----\n" +
                                    "1. Trung cấp\n" +
                                    "2. Cao đẳng\n" +
                                    "3. Đại học\n" +
                                    "4. Sau đại học");
                            System.out.print("Chọn loại trình độ học vấn: ");
                            try {
                                choiceEmployeeAcademicLevel = Integer.parseInt(scanner.nextLine());
                                switch (choiceEmployeeAcademicLevel) {
                                    case 1:
                                        newEmployeeAcademicLevel = "Trung cấp";
                                        break;
                                    case 2:
                                        newEmployeeAcademicLevel = "Cao đẳng";
                                        break;
                                    case 3:
                                        newEmployeeAcademicLevel = "Đại học";
                                        break;
                                    case 4:
                                        newEmployeeAcademicLevel = "Sau đại học";
                                        break;
                                    default:
                                        System.out.println("Hãy chọn lựa chọn từ 1-4");
                                        flagAcademicLevel = true;
                                        break;
                                }
                            } catch (NumberFormatException e) {
                                System.err.println("Hãy nhập số để lựa chọn");
                                flagAcademicLevel = true;
                            }
                        } while (flagAcademicLevel);
                        String newEmployeeWoringPosition = "";
                        int choiceEmployeeWoringPosition;
                        boolean flagWrokingPosition;
                        do {
                            flagWrokingPosition = false;
                            System.out.println("Hãy nhập vị trí của nhân viên mới");
                            System.out.println("----Các vị trí công việc----\n" +
                                    "1. Lễ tân\n" +
                                    "2. Phục vụ\n" +
                                    "3. Chuyên viên\n" +
                                    "4. Giám sát\n" +
                                    "5. Quản lý\n" +
                                    "6. Giám đốc");
                            System.out.print("Chọn loại trình độ học vấn: ");
                            try {
                                choiceEmployeeWoringPosition = Integer.parseInt(scanner.nextLine());
                                switch (choiceEmployeeWoringPosition) {
                                    case 1:
                                        newEmployeeWoringPosition = "Lễ tân";
                                        break;
                                    case 2:
                                        newEmployeeWoringPosition = "Phục vụ";
                                        break;
                                    case 3:
                                        newEmployeeWoringPosition = "Chuyên viên";
                                        break;
                                    case 4:
                                        newEmployeeWoringPosition = "Giám sát";
                                        break;
                                    case 5:
                                        newEmployeeWoringPosition = "Quản lý";
                                        break;
                                    case 6:
                                        newEmployeeWoringPosition = "Giám đốc";
                                        break;
                                    default:
                                        System.out.println("Hãy nhập lựa chọn từ 1-6");
                                        flagWrokingPosition = true;
                                        break;
                                }
                            } catch (NumberFormatException e) {
                                System.err.println("Hãy nhập số để lựa chọn");
                                flagWrokingPosition = true;
                            }
                        } while (flagWrokingPosition);
                        System.out.print("Hãy nhập lương của nhân viên mới: ");
                        String newEmployeeSalary = scanner.nextLine();
                        service.add(new Employee(newEmployeeFullName, newEmployeeDateOfBirth, newEmployeeGender,
                                newEmployeeIdentityNumber, newEmployeePhoneNumber, newEmployeeEmail, newEmployeeId,
                                newEmployeeAcademicLevel, newEmployeeWoringPosition, newEmployeeSalary));
                        break;
                    case 3:
                        System.out.print("Hãy nhập id của nhân viên muốn xóa: ");
                        String id = scanner.nextLine();
                        Employee employee = service.findById(id);
                        if (employee != null) {
                            service.deleteEmployee(employee);
                        } else {
                            try {
                                throw new NotFoundException("NotFoundException");
                            } catch (NotFoundException e) {
                                System.err.println("Không tìm thấy id để xóa");
                            }
                        }
                        break;
                    case 4:
                        System.out.print("Hãy nhập id của nhân viên muốn điều chỉnh: ");
                        id = scanner.nextLine();
                        Employee employee1 = service.findById(id);
                        if (employee1 != null) {
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
                                        "9. lương\n" +
                                        "10. Thoát chọn");
                                System.out.print("Hãy nhập thông tin bạn muốn sửa: ");
                                try {
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
                                            String newAcademicLevel = "";
                                            boolean flagEditAcademicLevel;
                                            do {
                                                flagEditAcademicLevel = false;
                                                System.out.println("Hãy nhập trình độ học vấn mới");
                                                System.out.println("----Các trình độ học vấn----\n" +
                                                        "1. Trung cấp\n" +
                                                        "2. Cao đẳng\n" +
                                                        "3. Đại học\n" +
                                                        "4. Sau đại học");
                                                System.out.print("Chọn loại trình độ học vấn: ");
                                                try {
                                                    int choiceAcademicLevel = Integer.parseInt(scanner.nextLine());
                                                    switch (choiceAcademicLevel) {
                                                        case 1:
                                                            newAcademicLevel = "Trung cấp";
                                                            break;
                                                        case 2:
                                                            newAcademicLevel = "Cao đẳng";
                                                            break;
                                                        case 3:
                                                            newAcademicLevel = "Đại học";
                                                            break;
                                                        case 4:
                                                            newAcademicLevel = "Sau đại học";
                                                            break;
                                                        default:
                                                            System.out.println("Hãy chọn lựa chọn từ 1-4");
                                                            flagEditAcademicLevel = true;
                                                            break;
                                                    }
                                                } catch (NumberFormatException e) {
                                                    System.err.println("Hãy nhập số để lựa chọn dịch vụ");
                                                    flagEditAcademicLevel = true;
                                                }
                                            } while (flagEditAcademicLevel);
                                            employee1.setAcademicLevel(newAcademicLevel);
                                            break;
                                        case 8:
                                            String newWorkingPosition = "";
                                            boolean flagEditWorkingPosition;
                                            do {
                                                flagEditWorkingPosition = false;
                                                System.out.println("Hãy tạo vị trí mới");
                                                System.out.println("----Các vị trí công việc----\n" +
                                                        "1. Lễ tân\n" +
                                                        "2. Phục vụ\n" +
                                                        "3. Chuyên viên\n" +
                                                        "4. Giám sát\n" +
                                                        "5. Quản lý\n" +
                                                        "6. Giám đốc");
                                                System.out.print("Chọn loại trình độ học vấn: ");
                                                try {
                                                    int choiceWorkingPosition = Integer.parseInt(scanner.nextLine());
                                                    switch (choiceWorkingPosition) {
                                                        case 1:
                                                            newWorkingPosition = "Lễ tân";
                                                            break;
                                                        case 2:
                                                            newWorkingPosition = "Phục vụ";
                                                            break;
                                                        case 3:
                                                            newWorkingPosition = "Chuyên viên";
                                                            break;
                                                        case 4:
                                                            newWorkingPosition = "Giám sát";
                                                            break;
                                                        case 5:
                                                            newWorkingPosition = "Quản lý";
                                                            break;
                                                        case 6:
                                                            newWorkingPosition = "Giám đốc";
                                                            break;
                                                        default:
                                                            System.out.println("Hãy nhập lựa chọn từ 1-6");
                                                            flagEditWorkingPosition = true;
                                                            break;
                                                    }
                                                } catch (NumberFormatException e) {
                                                    System.err.println("Hãy nhập số để lựa chọn dịch vụ");
                                                    flagEditWorkingPosition = true;
                                                }
                                            } while (flagEditWorkingPosition);
                                            employee1.setWorkingPosition(newWorkingPosition);
                                            break;
                                        case 9:
                                            System.out.print("Hãy nhập lương mới: ");
                                            String newSalary = scanner.nextLine();
                                            employee1.setSalary(newSalary);
                                            break;
                                    }
                                } catch (NumberFormatException e) {
                                    System.err.println("Hãy nhập số để lựa chọn dịch vụ");
                                }
                            } while (choiceEditEmployee != 10);
                            service.editEmployee(employee1);
                        } else {
                            try {
                                throw new NotFoundException("NotFoundException");
                            } catch (NotFoundException e) {
                                System.err.println("Không tìm thấy id");
                            }
                        }
                        break;
                    default:
                        System.out.println("Hãy nhập lựa chọn từ 1-4");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Hãy nhập số để lựa chọn dịch vụ");
            }
        } while (choiceEmployeeService != 5);
    }
}