package ss15_exception_debug.ss15_illegal_triangle_exception;

import java.util.Scanner;

public class IllegalTriangleExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh 1: ");
        int edge1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập độ dài cạnh 2: ");
        int edge2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập độ dài cạnh 3: ");
        int edge3 = Integer.parseInt(scanner.nextLine());
        IllegalTriangleExceptionCheck illegalTriangleExceptionCheck = new IllegalTriangleExceptionCheck();
        illegalTriangleExceptionCheck.checkIllegalTriangleException(edge1, edge2, edge3);
    }
}
