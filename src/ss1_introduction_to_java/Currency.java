package ss1_introduction_to_java;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        System.out.println("Nhập giá trị tiền USD vào: ");
        Scanner moneyInput = new Scanner(System.in);
        int moneyUSD = Integer.parseInt(moneyInput.nextLine());
        int moneyVND = moneyUSD*23000;
        System.out.println("Tiền được quy đổi tưởng ứng là: " + moneyVND + " VND");
    }
}
