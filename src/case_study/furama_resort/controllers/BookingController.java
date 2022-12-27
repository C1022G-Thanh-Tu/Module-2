package case_study.furama_resort.controllers;

import case_study.furama_resort.model.Booking;
import case_study.furama_resort.services.class_service.BookingService;
import case_study.furama_resort.services.interface_service.IBookingService;

import java.time.LocalDate;
import java.util.Scanner;

public class BookingController {
    public void controlBooking() {
        IBookingService bookingService = new BookingService();
        Scanner scanner = new Scanner(System.in);
        int choiceBookingService;
        boolean flag = true;
        do {
            System.out.println("---Booking Management---\n"
                    + "1. Display list booking\n"
                    + "2. Add new booking\n"
                    + "3. Return main menu");
            System.out.print("Hãy chọn dịch vụ: ");
            choiceBookingService = Integer.parseInt(scanner.nextLine());
            switch (choiceBookingService) {
                case 1:
                    bookingService.display();
                    break;
                case 2:
                    bookingService.displayCustomerList();
                    int choiceFacilityList;
                    do {
                        choiceFacilityList = Integer.parseInt(scanner.nextLine());
                        System.out.println("---Danh sách dịch vụ cơ sở vật chất----\n" +
                                "1. Room\n" +
                                "2. Villa\n" +
                                "3. Thoát");
                        System.out.print("Hãy chọn loại dịch vụ bạn muốn xem: ");
                        switch (choiceFacilityList) {
                            case 1:
                                bookingService.displayRoomList();
                                break;
                            case 2:
                                bookingService.displayVillaList();
                                break;
                        }
                    } while (choiceFacilityList !=3);
                    System.out.print("Nhập mã booking: ");
                    int newBookingCode = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập ngày bắt đầu: ");
                    LocalDate newStartDate = LocalDate.of(2022, 6, 12);
                    System.out.print("Nhập ngày kết thúc: ");
                    LocalDate newEndDate = LocalDate.of(2022, 6, 15);
                    System.out.print("Nhập mã khách hàng: ");
                    int newCustomerId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên dịch vụ cơ sở vật chất: ");
                    String newServiceName = scanner.nextLine();
                    Booking booking = new Booking(newBookingCode, newStartDate, newEndDate, newCustomerId, newServiceName);
                    bookingService.add(booking);
                    break;
                case 3:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}