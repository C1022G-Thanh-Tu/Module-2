package ss2_loop_java;

public class Geometry {
    public static void main(String[] args) {
        int i, j;
        for (i=0; i<3; i++) {
            for (j=0; j<7; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (i=1; i<6; i++) {
            for (j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (i=5; i<6 && i>=0; i--) {
            for (j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (i=1; i<6; i++) {
            for (j=5; i<j; j--) {
                System.out.print(" ");
            }
            for (j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
