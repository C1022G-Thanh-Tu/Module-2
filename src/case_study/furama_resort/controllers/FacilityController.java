package case_study.furama_resort.controllers;

import case_study.furama_resort.model.facility.Room;
import case_study.furama_resort.model.facility.Villa;
import case_study.furama_resort.services.class_service.FacilityService;
import case_study.furama_resort.services.interface_service.IFacilityService;

import java.util.Scanner;

public class FacilityController {
    public void controlFacility() {
        IFacilityService service = new FacilityService();
        Scanner scanner = new Scanner(System.in);
        int choiceFacilityService;
        boolean flag = true;
        do {
            System.out.println("---Facility Management---\n"
                    + "1. Display list facility\n"
                    + "2. Add new facility\n"
                    + "3. Display list facility maintenance\n"
                    + "4. Return main menu");
            System.out.print("Hãy chọn dịch vụ: ");
            choiceFacilityService = Integer.parseInt(scanner.nextLine());
            switch (choiceFacilityService) {
                case 1:
                    int choiceDisplayFacilityList;
                    System.out.println("---Danh sách dịch vụ cơ sở vật chất----\n" +
                            "1. Room\n" +
                            "2. Villa\n" +
                            "3. Thoát");
                    System.out.print("Hãy chọn hiển thị loại danh sách dịch vụ bạn muốn: ");
                    choiceDisplayFacilityList = Integer.parseInt(scanner.nextLine());
                    switch (choiceDisplayFacilityList) {
                        case 1:
                            service.display();
                            break;
                        case 2:
                            service.displayVillaList();
                            break;
                    }
                    break;
                case 2:
                    int choiceAddNewFacility;
                    do {
                        System.out.println("---Danh sách dịch vụ cơ sở vật chất----\n" +
                                "1. Room\n" +
                                "2. Villa");
                        System.out.print("Hãy chọn loại dịch vụ bạn muốn thêm: ");
                        choiceAddNewFacility = Integer.parseInt(scanner.nextLine());
                        switch (choiceAddNewFacility) {
                            case 1:
                                System.out.print("Tên dịch vụ: ");
                                String nameRoomService = scanner.nextLine();
                                System.out.print("Diện tích sử dựng: ");
                                int usableArea = Integer.parseInt(scanner.nextLine());
                                System.out.print("Chi phí thuê: ");
                                int rentalCosts = Integer.parseInt(scanner.nextLine());
                                System.out.print("Số lượng người tối đa: ");
                                int maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
                                System.out.println("Kiểu thuê\n" +
                                        "1. theo ngày\n" +
                                        "2. Theo tháng\n" +
                                        "3. Theo năm");
                                System.out.print("Hãy chọn kiểu thuê bạn muốn thêm: ");
                                int choiceRentalType = Integer.parseInt(scanner.nextLine());
                                String rentalType = "";
                                switch (choiceRentalType) {
                                    case 1:
                                        rentalType = "Theo ngày";
                                        break;
                                    case 2:
                                        rentalType = "Theo tháng";
                                        break;
                                    case 3:
                                        rentalType = "Theo năm";
                                }
                                System.out.print("Dịch vụ miễn phí kèm theo: ");
                                String freeService = scanner.nextLine();
                                Room room = new Room(nameRoomService, usableArea, rentalCosts, maximumNumberOfPeople,
                                        rentalType, freeService);
                                service.addNewRoom(room);
                                break;
                            case 2:
                                System.out.print("Tên dịch vụ: ");
                                nameRoomService = scanner.nextLine();
                                System.out.print("Diện tích sử dựng: ");
                                usableArea = Integer.parseInt(scanner.nextLine());
                                System.out.print("Chi phí thuê: ");
                                rentalCosts = Integer.parseInt(scanner.nextLine());
                                System.out.print("Số lượng người tối đa: ");
                                maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
                                System.out.println("Kiểu thuê\n" +
                                        "1. theo ngày\n" +
                                        "2. Theo tháng\n" +
                                        "3. Theo năm");
                                System.out.print("Hãy chọn kiểu thuê bạn muốn thêm: ");
                                choiceRentalType = Integer.parseInt(scanner.nextLine());
                                rentalType = "";
                                switch (choiceRentalType) {
                                    case 1:
                                        rentalType = "Theo ngày";
                                        break;
                                    case 2:
                                        rentalType = "Theo tháng";
                                        break;
                                    case 3:
                                        rentalType = "Theo năm";
                                }
                                System.out.print("Tiêu chuẩn phòng: ");
                                String roomStandard = scanner.nextLine();
                                System.out.print("Diện tích hồ bơi: ");
                                int poolAera = Integer.parseInt(scanner.nextLine());
                                System.out.print("Số tầng: ");
                                int floorNumber = Integer.parseInt(scanner.nextLine());
                                Villa villa = new Villa(nameRoomService, usableArea, rentalCosts, maximumNumberOfPeople
                                        , rentalType, roomStandard, poolAera, floorNumber);
                                service.adNewVilla(villa);
                                break;
                        }
                    } while (choiceAddNewFacility != 3);
                    break;
                case 3:
                    int choiceFacilityMaintenance;
                    do {
                        System.out.println("----Danh sách các dịch vụ cơ sở vật chất cần bảo trì----\n" +
                                "1. Room\n" +
                                "2. Villa\n" +
                                "3. Thoát");
                        System.out.print("Hãy chọn xem danh sách cần bảo trì của dịch vụ tương ứng: ");
                        choiceFacilityMaintenance = Integer.parseInt(scanner.nextLine());
                        switch (choiceFacilityMaintenance) {
                            case 1:
                                service.createListRoomMaintenance();
                                service.displayListRoomMaintenance();
                                break;
                            case 2:
                                service.createListVillaMaintenance();
                                service.displayListVillaMaintenance();
                                break;
                        }
                    } while (choiceFacilityMaintenance != 3);

                    break;
                case 4:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
