package ss2_loop_java;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        System.out.print("Nhập chiều dài mảng");
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        int i;
        for (i=0; i<length; i++) {
            System.out.print("Nhập phần tử arr["+i+"]");
            int element = Integer.parseInt(scanner.nextLine());
            arr[i] = element;
        }
        int min = arr[0];
        for (i=1; i<length; i++) {
            if (min>arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là:" + min);
    }
}
