package ss5_access_modifier_static_method_static_property.access_modifier2;

public class Student {
    private String name;
    private String classes;
    private static String studyCenter = "Codegym";

    public static String getStudyCenter() {
        return studyCenter;
    }

    public static void setStudyCenter(String studyCenter) {
        Student.studyCenter = studyCenter;
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public Student() {
        this("John", "C02");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", studyCenter='" + studyCenter + '\'' +
                '}';
    }
}
