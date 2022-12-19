package ss13_searching_algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUsingRecursive {
    public static int binarySearch(int[] array, int left, int right ,int value) {
        int middle = (left+right)/2;
        for (int i = 0; i < array.length; i++){
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] < value) {
                return binarySearch(array, middle+1, right, value);
            } else {
                return binarySearch(array, left, middle-1, value);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < length ; i++) {
            System.out.print("Nhập phần tử a["+i+"]: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);
        System.out.print("Nhập giá trị cần tìm: ");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println("Số cần tìm nằm ở vị trí: " + binarySearch(arr, 0, length-1, value));
    }
}
