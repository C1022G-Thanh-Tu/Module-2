package ss2_loop_java;

import java.util.Arrays;
import java.util.Scanner;


public class InsertElement {
    public static void main(String[] args) {
        System.out.print("Nhập chiều dài mảng");
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[length];
        int[] arr2 = new int[length+1];
        int i;
        for (i=0; i<length; i++) {
            System.out.print("Nhập phần tử arr["+i+"]");
            int element = Integer.parseInt(scanner.nextLine());
            arr1[i] = element;
        }
        System.out.print("Nhập phần tử X");
        int xValue = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá trị index");
        int index = Integer.parseInt(scanner.nextLine());
        if (index <0 || index>length-1) {
            System.out.println("Không chèn X vào mảng được");
        } else {
            for (i=0; i<length+1; i++) {
                if (index == i) {
                    arr2[i] = xValue;
                } else if (index > i) {
                    arr2[i] = arr1[i];
                } else {
                    arr2[i] = arr1[i-1];
                }
            }
            System.out.println(Arrays.toString(arr2)) ;
        }

    }
}
