package case_study.furama_resort.model.person;

public class Employee extends Person {
    private int employeeId;
    private String academicLevel;
    private String workingPosition;
    private int salary;

    public Employee() {
    }

    public Employee(String fullName, String dateOfBirth, String gender, String indentityCardNumber, String phoneNumber,
                    String email, int employeeId, String academicLevel, String workingPosition, int salary) {
        super(fullName, dateOfBirth, gender, indentityCardNumber, phoneNumber, email);
        this.employeeId = employeeId;
        this.academicLevel = academicLevel;
        this.workingPosition = workingPosition;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getWorkingPosition() {
        return workingPosition;
    }

    public void setWorkingPosition(String workingPosition) {
        this.workingPosition = workingPosition;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", academicLevel='" + academicLevel + '\'' +
                ", workingPosition='" + workingPosition + '\'' +
                ", salary=" + salary +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", indentityCardNumber=" + indentityCardNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
