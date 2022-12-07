package ss2_loop_java;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao mảng");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chiều dài mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[height][length];
        int i,j;
        for (i=0; i<height; i++) {
            for (j=0; j<length; j++) {
                System.out.print("Nhập phần tử arr["+i+"]["+j+"] cho mảng");
                int element = Integer.parseInt(scanner.nextLine());
                arr[i][j] = element;
            }
        }
        int max = arr[0][0];
        for (i=0; i<height; i++) {
            for (j=1; j<length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: "+max);
    }
}
