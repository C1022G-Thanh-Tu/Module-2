package ss4_class_object_java.bai_can_bac_2;

import ss4_class_object_java.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập giá trị b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập giá trị c");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() <0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("x1 = x2 = " + (-quadraticEquation.getB()/(2*quadraticEquation.getA())));
        } else {
            System.out.println("x1 = " + quadraticEquation.getRoot1());
            System.out.println("x2 = " + quadraticEquation.getRoot2());
        }
    }
}
