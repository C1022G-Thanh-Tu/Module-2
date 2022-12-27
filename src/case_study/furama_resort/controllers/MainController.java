package case_study.furama_resort.controllers;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu() {
        System.out.println("---Furama Management---\n"
                + "1. Employee Management\n"
                + "2. Customer Management\n"
                + "3. Facility Management\n"
                + "4. Booking Management\n"
                + "5. Promotion Management\n"
                + "6. Exit");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            displayMainMenu();
            System.out.print("Hãy lựa chọn dịch vụ: ");
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
        } while (true);
    }
}