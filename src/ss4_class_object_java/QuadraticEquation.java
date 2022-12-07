package ss4_class_object_java;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b*this.b - 4*this.a*this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(this.getDiscriminant()))/(2*this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(this.getDiscriminant()))/(2*this.a);
    }

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