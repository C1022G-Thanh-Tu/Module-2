package case_study.furama_resort.controllers;

import case_study.furama_resort.Regex_Code;
import case_study.furama_resort.model.facility.Room;
import case_study.furama_resort.model.facility.Villa;
import case_study.furama_resort.services.class_service.FacilityService;
import case_study.furama_resort.services.interface_service.IFacilityService;

import java.util.Scanner;

public class FacilityController {
    public void controlFacility() {
        Regex_Code regexCode = new Regex_Code();
        IFacilityService service = new FacilityService();
        Scanner scanner = new Scanner(System.in);
        int choiceFacilityService;
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
                            "2. Villa");
                    System.out.print("Hãy chọn hiển thị loại danh sách dịch vụ bạn muốn: ");
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
                    }
                    break;
                case 2:
                    int choiceAddNewFacility;
                    do {
                        System.out.println("---Danh sách dịch vụ cơ sở vật chất----\n" +
                                "1. Room\n" +
                                "2. Villa\n" +
                                "3. Thoát");
                        System.out.print("Hãy chọn loại dịch vụ bạn muốn thêm: ");
                        choiceAddNewFacility = Integer.parseInt(scanner.nextLine());
                        switch (choiceAddNewFacility) {
                            case 1:
                                String nameRoomService;
                                do {
                                    System.out.print("Tên dịch vụ: ");
                                    nameRoomService = scanner.nextLine();
                                    if (!nameRoomService.matches(regexCode.getSERVICE_NAME_REGEX())) {
                                        System.out.println("Hãy nhập đúng cấu trúc tên dịch vụ cơ sơ vật chất");
                                    }
                                } while (!nameRoomService.matches(regexCode.getSERVICE_NAME_REGEX()));
                                String usableArea;
                                do {
                                    System.out.print("Diện tích sử dựng: ");
                                    usableArea = scanner.nextLine();
                                    if (!usableArea.matches(regexCode.getUSABLE_AREA_REGEX())) {
                                        System.out.println("Hãy nhập diện tích có giá trị lớn hơn 30");
                                    }
                                } while (!usableArea.matches(regexCode.getUSABLE_AREA_REGEX()));
                                String rentalCosts;
                                do {
                                    System.out.print("Chi phí thuê: ");
                                    rentalCosts = scanner.nextLine();
                                    if (!rentalCosts.matches(regexCode.getRENTAL_COSTS_REGEX())) {
                                        System.out.println("Hãy nhập giá trị là số dương");
                                    }
                                } while (!rentalCosts.matches(regexCode.getRENTAL_COSTS_REGEX()));
                                String maximumNumberOfPeople;
                                do {
                                    System.out.print("Số lượng người tối đa: ");
                                    maximumNumberOfPeople = scanner.nextLine();
                                    if (!maximumNumberOfPeople.matches(regexCode.getMAXIMUM_NUMBER_OF_PEOPLE())) {
                                        System.out.println("Số lượng người phải >0 và <20");
                                    }
                                } while (!maximumNumberOfPeople.matches(regexCode.getMAXIMUM_NUMBER_OF_PEOPLE()));
                                System.out.println("Kiểu thuê\n" +
                                        "1. Theo ngày\n" +
                                        "2. Theo tháng\n" +
                                        "3. Theo năm");
                                System.out.print("Hãy nhập kiểu thuê bạn muốn thêm: ");
                                String rentalType;
                                do {
                                    rentalType = scanner.nextLine();
                                    if (!rentalType.matches(regexCode.getRENTAL_TYPE_REGEX())) {
                                        System.out.println("Chữ cái đầu phải viết hoa, và chữ cái sau viết thường");
                                    }
                                } while (!rentalType.matches(regexCode.getRENTAL_TYPE_REGEX()));
                                String serviceCode;
                                do {
                                    System.out.print("Nhập mã dịch vụ: ");
                                    serviceCode = scanner.nextLine();
                                    if (!serviceCode.matches(regexCode.getROOM_CODE_REGEX())) {
                                        System.out.println("Cú pháp: SVVL-XXXX");
                                    }
                                } while (!serviceCode.matches(regexCode.getROOM_CODE_REGEX()));
                                System.out.print("Dịch vụ miễn phí kèm theo: ");
                                String freeService = scanner.nextLine();
                                Room room = new Room(nameRoomService, usableArea, rentalCosts, maximumNumberOfPeople,
                                        rentalType, serviceCode,freeService);
                                service.add(room);
                                break;
                            case 2:
                                String nameVillaService;
                                do {
                                    System.out.print("Tên dịch vụ: ");
                                    nameVillaService = scanner.nextLine();
                                    if (!nameVillaService.matches(regexCode.getSERVICE_NAME_REGEX())) {
                                        System.out.println("Chữ cái đầu phải viết hoa, và chữ cái sau viết thường");
                                    }
                                } while (!nameVillaService.matches(regexCode.getSERVICE_NAME_REGEX()));
                                do {
                                    System.out.print("Diện tích sử dựng: ");
                                    usableArea = scanner.nextLine();
                                    if (!usableArea.matches(regexCode.getUSABLE_AREA_REGEX())) {
                                        System.out.println("Hãy nhập diện tích có giá trị lớn hơn 30");
                                    }
                                } while (!usableArea.matches(regexCode.getUSABLE_AREA_REGEX()));
                                do {
                                    System.out.print("Chi phí thuê: ");
                                    rentalCosts = scanner.nextLine();
                                    if (!rentalCosts.matches(regexCode.getRENTAL_COSTS_REGEX())) {
                                        System.out.println("Hãy nhập giá trị là số dương");
                                    }
                                } while (!rentalCosts.matches(regexCode.getRENTAL_COSTS_REGEX()));
                                do {
                                    System.out.print("Số lượng người tối đa: ");
                                    maximumNumberOfPeople = scanner.nextLine();
                                    if (!maximumNumberOfPeople.matches(regexCode.getMAXIMUM_NUMBER_OF_PEOPLE())) {
                                        System.out.println("Số lượng người phải >0 và <20");
                                    }
                                } while (!maximumNumberOfPeople.matches(regexCode.getMAXIMUM_NUMBER_OF_PEOPLE()));
                                System.out.println("Kiểu thuê\n" +
                                        "1. Theo ngày\n" +
                                        "2. Theo tháng\n" +
                                        "3. Theo năm");
                                System.out.print("Hãy chọn kiểu thuê bạn muốn thêm: ");
                                do {
                                   rentalType=scanner.nextLine();
                                   if (!rentalType.matches(regexCode.getRENTAL_TYPE_REGEX())) {
                                       System.out.println("Chữ cái đầu phải viết hoa, và chữ cái sau viết thường");
                                   }
                                }while (!rentalType.matches(regexCode.getRENTAL_TYPE_REGEX()));

                                do {
                                    System.out.print("Nhập mã dịch vụ: ");
                                    serviceCode = scanner.nextLine();
                                    if (!serviceCode.matches(regexCode.getVILLA_CODE_REGEX())) {
                                        System.out.println("Cú pháp: SVRO-XXXX");
                                    }
                                } while (!serviceCode.matches(regexCode.getVILLA_CODE_REGEX()));
                                String roomStandard;
                                do {
                                    System.out.print("Tiêu chuẩn phòng: ");
                                    roomStandard = scanner.nextLine();
                                    if (!roomStandard.matches(regexCode.getROOM_STANDARD_REGEX())) {
                                        System.out.println("Chữ cái đầu phải viết hoa, và chữ cái sau viết thường");
                                    }
                                } while (!roomStandard.matches(regexCode.getROOM_STANDARD_REGEX()));
                                String poolAera;
                                do {
                                    System.out.print("Diện tích hồ bơi: ");
                                    poolAera = scanner.nextLine();
                                    if (!poolAera.matches(regexCode.getPOOL_AREA_REGEX())) {
                                        System.out.println("Hãy nhập diện tích có giá trị lớn hơn 30");
                                    }
                                } while (!poolAera.matches(regexCode.getPOOL_AREA_REGEX()));
                                String floorNumber;
                                do {
                                    System.out.print("Số tầng: ");
                                    floorNumber = scanner.nextLine();
                                    if (!floorNumber.matches(regexCode.getFLOOR_NUMBER_REGEX())) {
                                        System.out.println("Hãy nhập số nguyên dương");
                                    }
                                } while (!floorNumber.matches(regexCode.getFLOOR_NUMBER_REGEX()));
                                Villa villa = new Villa(nameVillaService, usableArea, rentalCosts, maximumNumberOfPeople
                                        , rentalType, serviceCode ,roomStandard, poolAera, floorNumber);
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
            }
        } while (choiceFacilityService != 4);
    }
}