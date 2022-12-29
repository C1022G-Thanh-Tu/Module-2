package case_study.furama_resort.model.person;

public abstract class Person {
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private String indentityCardNumber;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String fullName, String dateOfBirth, String gender, String indentityCardNumber, String phoneNumber, String email) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.indentityCardNumber = indentityCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIndentityCardNumber() {
        return indentityCardNumber;
    }

    public void setIndentityCardNumber(String indentityCardNumber) {
        this.indentityCardNumber = indentityCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", indentityCardNumber='" + indentityCardNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'';
    }
}