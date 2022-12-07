package giai_thuat;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFibonacciPrimes {
    public static boolean isPrime(int number) {
        int count = 0;
        for (int i = 1; i <= number ; i++) {
            if (number%i==0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên");
        int numbInput = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[numbInput+1];
        int[] arr2 = new int[numbInput+1];
        arr1[0] = 0;
        arr1[1] = 1;
        arr1[2] = arr1[0] + arr1[1];
        int i,j;
        for (i = 3; i<arr1.length; i++) {
            arr1[i] = arr1[i-1] + arr1[i-2];
        }
        for (i=0; i<arr1.length; i++) {
            if (isPrime(arr1[i])) {
                arr2[i] = arr1[i];
            }
        }
        for (i=0; i<arr2.length; i++) {
            if (arr2[i] == 0) {
                for (j=i; j<arr2.length-1; j++) {
                    arr2[j] = arr2[j+1];
                }
                arr2[arr2.length-1] = 1;
                i--;
            }
        }
        for (i=0; i<arr2.length; i++) {
            if (arr2[i] == 1) {
                arr2[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
