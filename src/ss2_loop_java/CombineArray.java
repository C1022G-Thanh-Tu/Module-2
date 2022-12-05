package ss2_loop_java;

import java.util.Arrays;
import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ  dài mảng 1");
        int length1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập độ dài mảng 2");
        int length2 = Integer.parseInt(scanner.nextLine());
        int length3 = length1 + length2;
        int[] arr1 = new int[length1];
        int[] arr2 = new int[length2];
        int[] arr3 = new int[length3];
        int i;
        for (i=0; i<length1; i++) {
            System.out.print("Nhập phần tử arr1["+i+"]");
            int element1 = Integer.parseInt(scanner.nextLine());
            arr1[i] = element1;
        }
        for (i=0; i<length2; i++) {
            System.out.print("Nhập phần tử arr2["+i+"]");
            int element2 = Integer.parseInt(scanner.nextLine());
            arr2[i] = element2;
        }
        for (i=0; i<length1; i++) {
            arr3[i] = arr1[i];
        }
        for (i=0; i<length2; i++) {
            arr3[length1+i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
