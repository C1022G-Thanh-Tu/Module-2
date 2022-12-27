package case_study.furama_resort.model;

import java.time.LocalDate;

public class Booking {
    private int bookingCode;
    private LocalDate startDate;
    private LocalDate endDate;
    private int customerId;
    private String serviceName;

    public Booking() {
    }

    public Booking(int bookingCode, LocalDate startDate, LocalDate endDate, int customerId, String serviceName) {
        this.bookingCode = bookingCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerId = customerId;
        this.serviceName = serviceName;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode=" + bookingCode +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", customerId=" + customerId +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
