package case_study.furama_resort.controllers;

import case_study.furama_resort.utils.RegexCode;
import case_study.furama_resort.model.facility.Room;
import case_study.furama_resort.model.facility.Villa;
import case_study.furama_resort.services.class_service.FacilityService;
import case_study.furama_resort.services.interface_service.IFacilityService;

import java.util.Scanner;

public class FacilityController {
    public void controlFacility() {
        IFacilityService service = new FacilityService();
        Scanner scanner = new Scanner(System.in);
        int choiceFacilityService = 0;
        do {
            System.out.println("---Hệ thống quản lý dịch vụ cơ sở hạ tầng---\n"
                    + "1. Hiển thị danh sách dịch vụ cơ sở hạ tầng\n"
                    + "2. Thêm dịch vụ cơ sở hạ tầng mới\n"
                    + "3. Hiển thị danh sách dịch vụ cơ sở hạ tầng cần bảo trì\n"
                    + "4. Về menu chính");
            System.out.print("Hãy chọn dịch vụ: ");
            try {
                choiceFacilityService = Integer.parseInt(scanner.nextLine());
                switch (choiceFacilityService) {
                    case 1:
                        int choiceDisplayFacilityList = 0;
                        do {
                            System.out.println("---Danh sách dịch vụ cơ sở vật chất----\n" +
                                    "1. Room\n" +
                                    "2. Villa\n" +
                                    "3. Thoát");
                            System.out.print("Hãy chọn hiển thị loại danh sách dịch vụ bạn muốn: ");
                            try {
                                choiceDisplayFacilityList = Integer.parseInt(scanner.nextLine());
                                switch (choiceDisplayFacilityList) {
                                    case 1:
                                        service.createListRoomMaintenance();
                                        service.display();
                                        break;
                                    case 2:
                                        service.createListVillaMaintenance();
                                        service.displayVillaList();
                                        break;
                                    default:
                                        System.out.println("Hãy chọn lựa chọn từ 1 hoặc 2");
                                        break;
                                }
                            } catch (NumberFormatException e) {
                                System.err.println("Hãy nhập số để lựa chọn dịch vụ");
                            }
                        } while (choiceDisplayFacilityList != 3);
                        break;
                    case 2:
                        int choiceAddNewFacility = 0;
                        do {
                            System.out.println("---Danh sách dịch vụ cơ sở vật chất----\n" +
                                    "1. Room\n" +
                                    "2. Villa\n" +
                                    "3. Thoát");
                            System.out.print("Hãy chọn loại dịch vụ bạn muốn thêm: ");
                            try {
                                choiceAddNewFacility = Integer.parseInt(scanner.nextLine());
                                switch (choiceAddNewFacility) {
                                    case 1:
                                        String nameRoomService;
                                        do {
                                            System.out.print("Tên dịch vụ: ");
                                            nameRoomService = scanner.nextLine();
                                            if (!nameRoomService.matches(RegexCode.SERVICE_NAME_REGEX)) {
                                                System.out.println("Hãy nhập đúng cấu trúc tên dịch vụ cơ sơ vật chất");
                                            }
                                        } while (!nameRoomService.matches(RegexCode.SERVICE_NAME_REGEX));
                                        String usableArea;
                                        do {
                                            System.out.print("Diện tích sử dựng: ");
                                            usableArea = scanner.nextLine();
                                            if (!usableArea.matches(RegexCode.USABLE_AREA_REGEX)) {
                                                System.out.println("Hãy nhập diện tích có giá trị lớn hơn 30");
                                            }
                                        } while (!usableArea.matches(RegexCode.USABLE_AREA_REGEX));
                                        String rentalCosts;
                                        do {
                                            System.out.print("Chi phí thuê: ");
                                            rentalCosts = scanner.nextLine();
                                            if (!rentalCosts.matches(RegexCode.RENTAL_COSTS_REGEX)) {
                                                System.out.println("Hãy nhập giá trị là số dương");
                                            }
                                        } while (!rentalCosts.matches(RegexCode.RENTAL_COSTS_REGEX));
                                        String maximumNumberOfPeople;
                                        do {
                                            System.out.print("Số lượng người tối đa: ");
                                            maximumNumberOfPeople = scanner.nextLine();
                                            if (!maximumNumberOfPeople.matches(RegexCode.MAXIMUM_NUMBER_OF_PEOPLE)) {
                                                System.out.println("Số lượng người phải >0 và <20");
                                            }
                                        } while (!maximumNumberOfPeople.matches(RegexCode.MAXIMUM_NUMBER_OF_PEOPLE));
                                        System.out.println("Kiểu thuê\n" +
                                                "1. Theo ngày\n" +
                                                "2. Theo tháng\n" +
                                                "3. Theo năm");
                                        System.out.print("Hãy nhập kiểu thuê bạn muốn thêm: ");
                                        String rentalType;
                                        do {
                                            rentalType = scanner.nextLine();
                                            if (!rentalType.matches(RegexCode.RENTAL_TYPE_REGEX)) {
                                                System.out.println("Chữ cái đầu phải viết hoa, và chữ cái sau viết thường");
                                            }
                                        } while (!rentalType.matches(RegexCode.RENTAL_TYPE_REGEX));
                                        String serviceCode;
                                        do {
                                            System.out.print("Nhập mã dịch vụ: ");
                                            serviceCode = scanner.nextLine();
                                            if (!serviceCode.matches(RegexCode.ROOM_CODE_REGEX)) {
                                                System.out.println("Cú pháp: SVVL-XXXX");
                                            }
                                        } while (!serviceCode.matches(RegexCode.ROOM_CODE_REGEX));
                                        System.out.print("Dịch vụ miễn phí kèm theo: ");
                                        String freeService = scanner.nextLine();
                                        Room room = new Room(nameRoomService, usableArea, rentalCosts, maximumNumberOfPeople,
                                                rentalType, serviceCode, freeService);
                                        service.add(room);
                                        break;
                                    case 2:
                                        String nameVillaService;
                                        do {
                                            System.out.print("Tên dịch vụ: ");
                                            nameVillaService = scanner.nextLine();
                                            if (!nameVillaService.matches(RegexCode.SERVICE_NAME_REGEX)) {
                                                System.out.println("Chữ cái đầu phải viết hoa, và chữ cái sau viết thường");
                                            }
                                        } while (!nameVillaService.matches(RegexCode.SERVICE_NAME_REGEX));
                                        do {
                                            System.out.print("Diện tích sử dựng: ");
                                            usableArea = scanner.nextLine();
                                            if (!usableArea.matches(RegexCode.USABLE_AREA_REGEX)) {
                                                System.out.println("Hãy nhập diện tích có giá trị lớn hơn 30");
                                            }
                                        } while (!usableArea.matches(RegexCode.USABLE_AREA_REGEX));
                                        do {
                                            System.out.print("Chi phí thuê: ");
                                            rentalCosts = scanner.nextLine();
                                            if (!rentalCosts.matches(RegexCode.RENTAL_COSTS_REGEX)) {
                                                System.out.println("Hãy nhập giá trị là số dương");
                                            }
                                        } while (!rentalCosts.matches(RegexCode.RENTAL_COSTS_REGEX));
                                        do {
                                            System.out.print("Số lượng người tối đa: ");
                                            maximumNumberOfPeople = scanner.nextLine();
                                            if (!maximumNumberOfPeople.matches(RegexCode.MAXIMUM_NUMBER_OF_PEOPLE)) {
                                                System.out.println("Số lượng người phải >0 và <20");
                                            }
                                        } while (!maximumNumberOfPeople.matches(RegexCode.MAXIMUM_NUMBER_OF_PEOPLE));
                                        System.out.println("Kiểu thuê\n" +
                                                "1. Theo ngày\n" +
                                                "2. Theo tháng\n" +
                                                "3. Theo năm");
                                        System.out.print("Hãy chọn kiểu thuê bạn muốn thêm: ");
                                        do {
                                            rentalType = scanner.nextLine();
                                            if (!rentalType.matches(RegexCode.RENTAL_TYPE_REGEX)) {
                                                System.out.println("Chữ cái đầu phải viết hoa, và chữ cái sau viết thường");
                                            }
                                        } while (!rentalType.matches(RegexCode.RENTAL_TYPE_REGEX));

                                        do {
                                            System.out.print("Nhập mã dịch vụ: ");
                                            serviceCode = scanner.nextLine();
                                            if (!serviceCode.matches(RegexCode.VILLA_CODE_REGEX)) {
                                                System.out.println("Cú pháp: SVRO-XXXX");
                                            }
                                        } while (!serviceCode.matches(RegexCode.VILLA_CODE_REGEX));
                                        String roomStandard;
                                        do {
                                            System.out.print("Tiêu chuẩn phòng: ");
                                            roomStandard = scanner.nextLine();
                                            if (!roomStandard.matches(RegexCode.ROOM_STANDARD_REGEX)) {
                                                System.out.println("Chữ cái đầu phải viết hoa, và chữ cái sau viết thường");
                                            }
                                        } while (!roomStandard.matches(RegexCode.ROOM_STANDARD_REGEX));
                                        String poolAera;
                                        do {
                                            System.out.print("Diện tích hồ bơi: ");
                                            poolAera = scanner.nextLine();
                                            if (!poolAera.matches(RegexCode.POOL_AREA_REGEX)) {
                                                System.out.println("Hãy nhập diện tích có giá trị lớn hơn 30");
                                            }
                                        } while (!poolAera.matches(RegexCode.POOL_AREA_REGEX));
                                        String floorNumber;
                                        do {
                                            System.out.print("Số tầng: ");
                                            floorNumber = scanner.nextLine();
                                            if (!floorNumber.matches(RegexCode.FLOOR_NUMBER_REGEX)) {
                                                System.out.println("Hãy nhập số nguyên dương");
                                            }
                                        } while (!floorNumber.matches(RegexCode.FLOOR_NUMBER_REGEX));
                                        Villa villa = new Villa(nameVillaService, usableArea, rentalCosts, maximumNumberOfPeople
                                                , rentalType, serviceCode, roomStandard, poolAera, floorNumber);
                                        service.adNewVilla(villa);
                                        break;
                                    default:
                                        System.out.println("Hãy chọn lựa chọn từ 1 hoặc 2");
                                        break;
                                }
                            } catch (NumberFormatException e) {
                                System.err.println("Hãy nhập số để lựa chọn dịch vụ");
                            }
                        } while (choiceAddNewFacility != 3);
                        break;
                    case 3:
                        int choiceFacilityMaintenance = 0;
                        do {
                            System.out.println("----Danh sách các dịch vụ cơ sở vật chất cần bảo trì----\n" +
                                    "1. Room\n" +
                                    "2. Villa\n" +
                                    "3. Thoát");
                            System.out.print("Hãy chọn xem danh sách cần bảo trì của dịch vụ tương ứng: ");
                            try {
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
                                    default:
                                        System.out.println("Hãy chọn lựa chọn từ 1 hoặc 2");
                                        break;
                                }
                            } catch (NumberFormatException e) {
                                System.err.println("Hãy nhập số để lựa chọn dịch vụ");
                            }
                        } while (choiceFacilityMaintenance != 3);
                        break;
                    default:
                        System.out.println("Hãy nhập lựa chọn từ 1-3");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Hãy nhập số để lựa chọn dịch vụ");
            }
        } while (choiceFacilityService != 4);
    }
}