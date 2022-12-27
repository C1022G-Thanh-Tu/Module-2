package case_study.furama_resort.services.class_service;

import case_study.furama_resort.model.Booking;
import case_study.furama_resort.model.person.Customer;
import case_study.furama_resort.repository.class_repository.BookingRepositrory;
import case_study.furama_resort.repository.class_repository.CustomerRepositrory;
import case_study.furama_resort.repository.interface_repository.IBookingRepository;
import case_study.furama_resort.repository.interface_repository.ICustomerRepository;
import case_study.furama_resort.services.interface_service.IBookingService;

import java.util.List;

public class BookingService implements IBookingService {
    IBookingRepository bookingRepository = new BookingRepositrory();

    @Override
    public void displayCustomerList() {
        bookingRepository.displayCustomerList();
    }

    @Override
    public void displayRoomList() {
        bookingRepository.displayRoomList();
    }

    @Override
    public void displayVillaList() {
        bookingRepository.displayVillaList();
    }


    @Override
    public void display() {
        bookingRepository.display();
    }

    @Override
    public void add(Object object) {
        Booking booking = (Booking) object;
        bookingRepository.add(booking);
    }
}
