package ss1_introduction_to_java;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Nhập tên bạn vào: ");
        Scanner nameInput = new Scanner(System.in);
        String nameOutput = nameInput.nextLine();
        System.out.println("Tên tôi là: " + nameOutput);
        nameInput.close();
    }
}
