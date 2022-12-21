package ss14_sorting_algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortSetting {
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j>0 && arr[j-1]>arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Nhập phần tử arr["+i+"]: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(insertionSort(array)));
    }
}
