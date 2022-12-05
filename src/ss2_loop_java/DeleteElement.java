package ss2_loop_java;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        int i, j;
        for (i=0; i<length; i++) {
            System.out.print("Nhập phần tử arr[" + i +"]");
            int element = Integer.parseInt(scanner.nextLine());
            arr[i] = element;
        }
        System.out.println("Nhập phần tử X");
        int xValue = Integer.parseInt(scanner.nextLine());
        for (i=0; i<length; i++) {
            if (xValue == arr[i]) {
                System.out.println("X có trong mảng tại vị trí arr[" + i +"]");
            }
        }
        for (i=0; i<length; i++) {
            if (xValue == arr[i]) {
                for (j=i; j<length-1; j++) {
                    arr[j] = arr[j+1];
                }
                arr[length-1] = 0;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
