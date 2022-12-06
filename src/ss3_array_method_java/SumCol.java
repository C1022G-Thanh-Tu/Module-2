package ss3_array_method_java;

import java.util.Scanner;

public class SumCol {
    public static String sumCol(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cột cần tính tổng");
        int col = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            sum+=array[i][col];
        }
        return "Tổng các số ở cột "+col+" là: " + sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao mảng");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chiều dài mảng phụ");
        int lenght = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[height][lenght];
        int i, j;
        for (i=0; i<arr.length; i++) {
            for (j=0; j<arr[i].length; j++) {
                System.out.print("Nhập giá trị cho phần tử arr["+i+"]["+j+"]");
                int element = Integer.parseInt(scanner.nextLine());
                arr[i][j] = element;
            }
        }
        System.out.println(sumCol(arr));
    }
}
