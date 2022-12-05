package ss2_loop_java;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        System.out.println("Menu: 1. Print the rectangle, 2. Print the square triangle, 3. Print isosceles triangle, 4. Exit");
        System.out.print("Chọn hình vẽ bạn muốn: ");
        Scanner scanner = new Scanner(System.in);
        int value = Integer.parseInt(scanner.nextLine());
        int i, j;
        switch (value) {
            case 1:
                for (i=0; i<3; i++) {
                    for (j=0; j<7; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
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
                        System.out.print("  ");
                    }
                    for (j=0; j<i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                for (i=5; i<6 && i>=0; i--) {
                    for (j=6; i<(j-1); j--) {
                        System.out.print("  ");
                    }
                    for (j=0; j<i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (i=1; i<6; i++) {
                    for (j=5; i<j && j>=0; j--) {
                        System.out.print(" ");
                    }
                    for (j=0; j<i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
        }
    }
}
