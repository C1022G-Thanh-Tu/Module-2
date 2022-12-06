package ss3_array_method_java;

import java.util.Scanner;

public class SumCross {
    public static int sumCross(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[length][length];
        int i, j;
        for (i=0; i<length; i++) {
            for (j=0; j<arr[i].length; j++) {
                System.out.print("Nhập giá trị cho phần tử arr["+i+"]["+j+"]");
                int element = Integer.parseInt(scanner.nextLine());
                arr[i][j] = element;
            }
        }
        System.out.println("Tổng đường chéo chính trong mảng là: " + sumCross(arr));
    }
}
