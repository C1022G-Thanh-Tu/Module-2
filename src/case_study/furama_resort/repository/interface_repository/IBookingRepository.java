package case_study.furama_resort.repository.interface_repository;

import case_study.furama_resort.model.Booking;

import java.util.Set;

public interface IBookingRepository extends IMainRepository{
    void displayCustomerList();
    void displayRoomList();
    void displayVillaList();
    Set<Booking> getAllBookingList();
}
