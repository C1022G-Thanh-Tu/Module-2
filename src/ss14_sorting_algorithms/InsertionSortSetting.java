package ss14_sorting_algorithms;

import java.util.Arrays;

public class InsertionSortSetting {
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            for (;j>0 && arr[j-1]>arr[j]; j--) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] array = {4,2,8,19,12,56,89};
        System.out.println(Arrays.toString(insertionSort(array)));
    }
}
