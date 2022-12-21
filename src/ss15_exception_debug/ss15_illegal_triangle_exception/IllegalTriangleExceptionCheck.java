package ss15_exception_debug.ss15_illegal_triangle_exception;

public class IllegalTriangleExceptionCheck {
    public void checkIllegalTriangleException(int a, int b, int c) {
        try {
            if (a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a) {
                System.out.println("Các cạnh vừa nhập là cạnh tam giác");
            } else {
                throw new IllegalTriangleException("IllegalTriangle Exception");
            }
        } catch (IllegalTriangleException e) {
            System.out.println("Các cạnh vừa nhập không phải là cạnh tam giác");
        } finally {
            System.out.println("Kết thúc kiểm tra thông số vừa nhập");
        }
    }
}
