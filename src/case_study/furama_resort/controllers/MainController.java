package case_study.furama_resort.controllers;

import case_study.furama_resort.model.person.Customer;
import case_study.furama_resort.model.person.Employee;
import case_study.furama_resort.services.class_service.CustomerService;
import case_study.furama_resort.services.class_service.EmployeeService;
import case_study.furama_resort.services.interface_service.ICustomerService;
import case_study.furama_resort.services.interface_service.IEmployeeService;

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
            System.out.println();
            switch (choice) {
                case 1:
                    EmployeeController employeeController = new EmployeeController();
                    employeeController.employeeControl();
                    break;
                case 2:
                    CustomerController customerController = new CustomerController();
                    customerController.customerControl();
                    break;
                case 3:
                    System.out.println("---Facility Management---\n"
                            + "1. Display list facility\n"
                            + "2. Add new facility\n"
                            + "3. Edit facility maintenance\n"
                            + "4. Return main menu");
                    System.out.print("Hãy chọn dịch vụ: ");
                    int choiceFacilityService = Integer.parseInt(scanner.nextLine());
                    do {
                        switch (choiceFacilityService) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                    } while (choiceFacilityService != 4);
                    break;
                case 4:
                    System.out.println("---Booking Management---\n"
                            + "1. Display list booking\n"
                            + "2. Add new booking\n"
                            + "3. Return main menu");
                    System.out.print("Hãy chọn dịch vụ: ");
                    int choiceBookingService = Integer.parseInt(scanner.nextLine());
                    do {
                        switch (choiceBookingService) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                    } while (choiceBookingService != 3);
                    break;
                case 5:
                    System.out.println("---Promotion Management---\n"
                            + "1. Display customers use service\n"
                            + "2. Display list customers get voucher\n"
                            + "3. Return main menu");
                    System.out.print("Hãy chọn dịch vụ: ");
                    int choicePromotionService = Integer.parseInt(scanner.nextLine());
                    do {
                        switch (choicePromotionService) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                    } while (choicePromotionService != 3);
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}