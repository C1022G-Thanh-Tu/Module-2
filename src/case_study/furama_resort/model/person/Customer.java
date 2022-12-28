package case_study.furama_resort.model.person;

public class Customer extends Person {
    private int customerId;
    private String customerType;
    private String customerAddress;

    public Customer() {
    }

    public Customer(String fullName, String dateOfBirth, String gender, String indentityCardNumber, String phoneNumber
            , String email, int customerId, String customerType, String customerAddress) {
        super(fullName, dateOfBirth, gender, indentityCardNumber, phoneNumber ,email);
        this.customerId = customerId;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                "customerId=" + customerId +
                ", customerType='" + customerType + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                "} "  ;
    }
}
