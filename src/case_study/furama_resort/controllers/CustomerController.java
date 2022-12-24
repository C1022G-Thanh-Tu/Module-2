package case_study.furama_resort.controllers;

import case_study.furama_resort.model.person.Customer;
import case_study.furama_resort.services.class_service.CustomerService;
import case_study.furama_resort.services.interface_service.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    public void customerControl() {
        ICustomerService service = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        int choiceCustomerService = 0;
        do {
            System.out.println("---Customer Management---\n"
                    + "1. Display list customers\n"
                    + "2. Add new customer\n"
                    + "3. Edit customer\n"
                    + "4. Return main menu");
            System.out.print("Hãy chọn dịch vụ: ");
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
                    System.out.print("Hãy nhập loại của khách hàng mới: ");
                    String newCustomerType = scanner.nextLine();
                    System.out.print("Hãy địa chỉ của khách hàng mới: ");
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
                                    "8. Địa chỉ");
                            System.out.print("Hãy nhập thông tin bạn muốn sửa: ");
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
                                    System.out.print("Hãy nhập loại mới của khách hàng: ");
                                    String newType = scanner.nextLine();
                                    customer.setCustomerType(newType);
                                    break;
                                case 8:
                                    System.out.print("Hãy nhập địa chỉ mới của khách hàng: ");
                                    String newAddress = scanner.nextLine();
                                    customer.setCustomerAddress(newAddress);
                                    break;
                            }
                        } while (choiceEditCustomer < 9);
                    }
            }
        } while (choiceCustomerService < 4);
    }
}
