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
        System.out.print("Nhập số nguyên");
        int numbInput = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[numbInput+1];
        int n1 = 0;
        int n2 = 1;
        int nTotal = n1 + n2;
        int count = 0;
        int i = 0;
        while (nTotal<=numbInput) {
            n1 = n2;
            n2 = nTotal;
            nTotal = n1 + n2;
            if (isPrime(nTotal)) {
                if (nTotal<=numbInput) {
                    arr1[i] = nTotal;
                    i++;
                    count++;
                }
            }
        }
        int[] arr2 = new int[count];
        for (i=0; i<count; i++) {
            if (arr1[i] != 0) {
                arr2[i] = arr1[i];
            }
        }
        System.out.print(Arrays.toString(arr2));
    }
}