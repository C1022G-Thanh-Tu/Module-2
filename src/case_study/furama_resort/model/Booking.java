package case_study.furama_resort.model;

public class Booking {
    private int bookingCode;
    private String startDate;
    private String endDate;
    private String customerId;
    private String serviceName;

    public Booking() {
    }

    public Booking(int bookingCode, String startDate, String endDate,
                   String customerId, String serviceName) {
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
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
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerId='" + customerId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
