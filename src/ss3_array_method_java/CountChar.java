package ss3_array_method_java;

import java.util.Scanner;

public class CountChar {
    public static int countChar(char a, String string) {
        int count = 0;
        for (int i = 0; i <string.length() ; i++) {
            if (a == string.charAt(i)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ");
        String str = scanner.nextLine();
        System.out.print("Nhập ký tự bất kỳ");
        char character = scanner.next().charAt(0);
        System.out.println("Số lần xuất hiện của ký tự "+character+" trong chuỗi là: " + countChar(character, str));
    }
}
