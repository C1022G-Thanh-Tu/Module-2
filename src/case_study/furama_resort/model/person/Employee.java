package case_study.furama_resort.model.person;

public class Employee extends Person {
    private String employeeId;
    private String academicLevel;
    private String workingPosition;
    private String salary;

    public Employee() {
    }

    public Employee(String fullName, String dateOfBirth, String gender, String indentityCardNumber, String phoneNumber,
                    String email, String employeeId, String academicLevel, String workingPosition, String salary) {
        super(fullName, dateOfBirth, gender, indentityCardNumber, phoneNumber, email);
        this.employeeId = employeeId;
        this.academicLevel = academicLevel;
        this.workingPosition = workingPosition;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+
                "employeeId=" + employeeId +
                ", academicLevel='" + academicLevel + '\'' +
                ", workingPosition='" + workingPosition + '\'' +
                ", salary=" + salary +
                "} "  ;
    }
}