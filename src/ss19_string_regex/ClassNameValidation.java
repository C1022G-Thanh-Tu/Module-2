package ss19_string_regex;

import java.util.Scanner;

public class ClassNameValidation {
    public static final String CLASS_NAME_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tên lớp: ");
        String className = scanner.nextLine();
        if (className.matches(CLASS_NAME_REGEX)) {
            System.out.println("Tên lớp hợp lệ");
        } else {
            System.out.println("Tên lớp không hợp lệp");
        }
    }
}
