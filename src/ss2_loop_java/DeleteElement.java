package ss2_loop_java;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        int i;
        for (i=0; i<length; i++) {
            System.out.print("Nhập phần tử arr[" + i +"]");
            int element = Integer.parseInt(scanner.nextLine());
            arr[i] = element;
        }
        System.out.println("Nhập phần tử X");
        int xValue = Integer.parseInt(scanner.nextLine());
        Boolean flag = false;
        for (i=0; i<length; i++) {
            if (xValue == arr[i]) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("X thuộc mảng mới tạo");
        }
    }
}
