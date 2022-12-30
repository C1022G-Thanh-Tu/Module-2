package case_study.furama_resort.controllers;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu() {
        System.out.println("---Hệ thống quản lý Furama---\n"
                + "1. Hệ thống quản lý nhân viên\n"
                + "2. Hệ thống quản lý khách hàng\n"
                + "3. Hệ thống quản lý dịch vụ cơ sở hạ tầng\n"
                + "4. Hệ thống quản lý Booking\n"
                + "5. Hệ thống quản lý khuyến mãi\n"
                + "6. Thoát hệ thống");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            displayMainMenu();
            System.out.print("Hãy lựa chọn dịch vụ: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        EmployeeController employeeController = new EmployeeController();
                        employeeController.controlEmployee();
                        break;
                    case 2:
                        CustomerController customerController = new CustomerController();
                        customerController.controlCustomer();
                        break;
                    case 3:
                        FacilityController facilityController = new FacilityController();
                        facilityController.controlFacility();
                        break;
                    case 4:
//                    BookingController bookingController = new BookingController();
//                    bookingController.controlBooking();
                        break;
                    case 5:
                        System.out.println("---Promotion Management---\n"
                                + "1. Display customers use service\n"
                                + "2. Display list customers get voucher\n"
                                + "3. Return main menu");
                        System.out.print("Hãy chọn dịch vụ: ");
                        break;
                    case 6:
                        System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.err.println("Hãy nhập số để lựa chọn dịch vụ");
            }
        } while (true);
    }
}