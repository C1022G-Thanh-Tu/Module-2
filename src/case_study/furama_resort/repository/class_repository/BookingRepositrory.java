package case_study.furama_resort.repository.class_repository;

import case_study.furama_resort.model.Booking;
import case_study.furama_resort.model.person.Customer;
import case_study.furama_resort.repository.interface_repository.IBookingRepository;
import case_study.furama_resort.services.class_service.CustomerService;
import case_study.furama_resort.services.class_service.FacilityService;
import case_study.furama_resort.services.interface_service.ICustomerService;
import case_study.furama_resort.services.interface_service.IFacilityService;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BookingRepositrory implements IBookingRepository {
    ICustomerService customerService = new CustomerService();

    IFacilityService facilityService = new FacilityService();
    Booking booking = new Booking();
    Period period = Period.between(booking.getStartDate(), booking.getEndDate());

    static Set<Booking> bookingSet = new TreeSet<>(new Comparator<Booking>() {
        @Override
        public int compare(Booking o1, Booking o2) {
//            return o1.getStartDate() - o2.getStartDate();
            return 0;
        }
    });
    static {
        bookingSet.add(new Booking(1, LocalDate.of(2000, 7, 19),
                LocalDate.of(2000, 7, 21), 1,
                "SVRO-1514"));
        bookingSet.add(new Booking(2, LocalDate.of(2002, 12, 4),
                LocalDate.of(2002, 12, 7), 7,
                "SVVL-2607"));
    }

    @Override
    public void display() {
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }
    }

    @Override
    public void add(Object object) {
        Booking booking = (Booking) object;
        bookingSet.add(booking);
    }

    @Override
    public void displayCustomerList() {
        customerService.display();
    }

    @Override
    public void displayRoomList() {
        facilityService.display();
    }

    @Override
    public void displayVillaList() {
        facilityService.displayVillaList();
    }

    @Override
    public Set<Booking> getAllBookingList() {
        return bookingSet;
    }
}