package case_study.furama_resort.services.interface_service;

import case_study.furama_resort.model.person.Customer;

import java.util.List;

public interface IBookingService extends IMainService {
    void displayCustomerList();
    void displayRoomList();
    void displayVillaList();
}
