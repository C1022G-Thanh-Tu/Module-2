package ss19_string_regex;

import java.util.Scanner;

public class PhoneNumberValidation {
    public static final String PHONE_NUMBER_REGEX = "^[(]\\d{2}[)]-[(][0]\\d{9}[)]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy  nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        if (phoneNumber.matches(PHONE_NUMBER_REGEX)) {
            System.out.println("Số điện thoại hợp lệ");
        } else {
            System.out.println("Số điện thoại không hợp lệ");
        }
    }
}
