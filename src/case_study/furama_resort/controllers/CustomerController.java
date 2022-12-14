package case_study.furama_resort.controllers;

import case_study.furama_resort.model.person.Customer;
import case_study.furama_resort.services.class_service.CustomerService;
import case_study.furama_resort.services.interface_service.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    public void controlCustomer() {
        ICustomerService service = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        int choiceCustomerService = 0;
        do {
            System.out.println("---Hệ thống quản lý khách hàng---\n"
                    + "1. Hiển thị danh sách khách hàng\n"
                    + "2. Thêm khách hàng mới\n"
                    + "3. Điều chỉnh thông tin khách hàng\n"
                    + "4. Về menu chính");
            System.out.print("Hãy chọn dịch vụ: ");
            try {
                choiceCustomerService = Integer.parseInt(scanner.nextLine());
                switch (choiceCustomerService) {
                    case 1:
                        service.display();
                        break;
                    case 2:
                        System.out.print("Hãy nhập tên của khách hàng mới: ");
                        String newCustomerFullName = scanner.nextLine();
                        System.out.print("Hãy nhập ngày sinh của khách hàng mới: ");
                        String newCustomerDateOfBirth = scanner.nextLine();
                        System.out.print("Hãy nhập giới tính của khách hàng mới: ");
                        String newCustomerGender = scanner.nextLine();
                        System.out.print("Hãy nhập số CMND của khách hàng mới: ");
                        String newCustomerIdentityNumber = scanner.nextLine();
                        System.out.print("Hãy nhập số điện thoại của khách hàng mới: ");
                        String newCustomerPhoneNumber = scanner.nextLine();
                        System.out.print("Hãy nhập email của khách hàng mới: ");
                        String newCustomerEmail = scanner.nextLine();
                        System.out.print("Hãy nhập id của khách hàng mới: ");
                        int newCustomerId = Integer.parseInt(scanner.nextLine());
                        String newCustomerType = "";
                        int choiceCustomerType;
                        boolean flagCustomerType;
                        do {
                            flagCustomerType = false;
                            System.out.println("Hãy tạo loại của khách hàng mới");
                            System.out.println("----Loại khách hàng----\n" +
                                    "1. Diamond\n" +
                                    "2. Platinium\n" +
                                    "3. Gold\n" +
                                    "4. Silver\n" +
                                    "5. Member");
                            System.out.print("Chọn loại khách hàng: ");
                            try {
                                choiceCustomerType = Integer.parseInt(scanner.nextLine());
                                switch (choiceCustomerType) {
                                    case 1:
                                        newCustomerType = "Diamond";
                                        break;
                                    case 2:
                                        newCustomerType = "Platinium";
                                        break;
                                    case 3:
                                        newCustomerType = "Gold";
                                        break;
                                    case 4:
                                        newCustomerType = "Silver";
                                        break;
                                    case 5:
                                        newCustomerType = "Member";
                                        break;
                                    default:
                                        System.out.println("Hãy chọn lựa chọn từ 1-5");
                                        flagCustomerType = true;
                                        break;
                                }
                            } catch (NumberFormatException e) {
                                System.err.println("Hãy nhập số để lựa chọn dịch vụ");
                                flagCustomerType = true;
                            }
                        } while (flagCustomerType);
                        System.out.print("Hãy nhập địa chỉ của khách hàng mới: ");
                        String newCustomerAddress = scanner.nextLine();
                        service.add(new Customer(newCustomerFullName, newCustomerDateOfBirth, newCustomerGender,
                                newCustomerIdentityNumber, newCustomerPhoneNumber, newCustomerEmail, newCustomerId, newCustomerType,
                                newCustomerAddress));
                        break;
                    case 3:
                        System.out.print("Hãy nhập id của khách hàng muốn điều chỉnh: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        Customer customer = service.findById(id);
                        if (customer != null) {
                            int choiceEditCustomer = 0;
                            do {
                                System.out.println("---Các thông tin có thể sửa---\n" +
                                        "1. Tên\n" +
                                        "2. Ngày sinh\n" +
                                        "3. Giới tính\n" +
                                        "4. Số CMND\n" +
                                        "5. Số điện thoại\n" +
                                        "6. Email\n" +
                                        "7. Loại Khách hàng\n" +
                                        "8. Địa chỉ\n" +
                                        "9. Thoát chọn");
                                System.out.print("Hãy nhập thông tin bạn muốn sửa: ");
                                try {
                                    choiceEditCustomer = Integer.parseInt(scanner.nextLine());
                                    switch (choiceEditCustomer) {
                                        case 1:
                                            System.out.print("Hãy nhập tên mới: ");
                                            String newName = scanner.nextLine();
                                            customer.setFullName(newName);
                                            break;
                                        case 2:
                                            System.out.print("Hãy nhập ngày sinh mới: ");
                                            String newDateOfBirth = scanner.nextLine();
                                            customer.setDateOfBirth(newDateOfBirth);
                                            break;
                                        case 3:
                                            System.out.print("Hãy nhập giới tính mới: ");
                                            String newGender = scanner.nextLine();
                                            customer.setGender(newGender);
                                            break;
                                        case 4:
                                            System.out.print("Hãy nhập số CMND mới: ");
                                            String newIndentityNumber = scanner.nextLine();
                                            customer.setIndentityCardNumber(newIndentityNumber);
                                            break;
                                        case 5:
                                            System.out.print("Hãy nhập số điện thoại mới: ");
                                            String newPhoneNumber = scanner.nextLine();
                                            customer.setPhoneNumber(newPhoneNumber);
                                            break;
                                        case 6:
                                            System.out.print("Hãy nhập email mới: ");
                                            String newEmail = scanner.nextLine();
                                            customer.setEmail(newEmail);
                                            break;
                                        case 7:
                                            String newType = "";
                                            int choiceType;
                                            boolean flagEditCustomerType;
                                            do {
                                                flagEditCustomerType = false;
                                                System.out.println("Hãy tạo loại mới của khách hàng");
                                                System.out.println("----Loại khách hàng----\n" +
                                                        "1. Diamond\n" +
                                                        "2. Platinium\n" +
                                                        "3. Gold\n" +
                                                        "4. Silver\n" +
                                                        "5. Member");
                                                System.out.print("Chọn loại mới của khách hàng: ");
                                                try {
                                                    choiceType = Integer.parseInt(scanner.nextLine());
                                                    switch (choiceType) {
                                                        case 1:
                                                            newType = "Diamond";
                                                            break;
                                                        case 2:
                                                            newType = "Platinium";
                                                            break;
                                                        case 3:
                                                            newType = "Gold";
                                                            break;
                                                        case 4:
                                                            newType = "Silver";
                                                            break;
                                                        case 5:
                                                            newType = "Member";
                                                            break;
                                                        default:
                                                            System.out.println("Hãy chọn lựa chọn từ 1-5");
                                                            flagEditCustomerType = true;
                                                            break;
                                                    }
                                                } catch (NumberFormatException e) {
                                                    System.err.println("Hãy nhập số để lựa chọn");
                                                    flagEditCustomerType = true;
                                                }
                                            } while (flagEditCustomerType);
                                            customer.setCustomerType(newType);
                                            break;
                                        case 8:
                                            System.out.print("Hãy nhập địa chỉ mới của khách hàng: ");
                                            String newAddress = scanner.nextLine();
                                            customer.setCustomerAddress(newAddress);
                                            break;
                                    }
                                } catch (NumberFormatException e) {
                                    System.err.println("Hãy nhập số để lựa chọn dịch vụ");
                                }
                            } while (choiceEditCustomer != 9);
                            service.editCustomer(customer);
                        }
                        break;
                    default:
                        System.out.println("Hãy nhập lựa chọn từ 1-3");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Hãy nhập số để lựa chọn dịch vụ");
            }
        } while (choiceCustomerService != 4);
    }
}