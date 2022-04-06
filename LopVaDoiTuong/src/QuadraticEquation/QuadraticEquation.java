package QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
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

    public double getDelta() {
        return Math.pow(this.b, 2) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        return (-this.b + Math.pow(this.getDelta(), 0.5)) / (this.a * 2);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(this.getDelta(), 0.5)) / (this.a * 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a , b , c : ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Ban da nhap a = " + quadraticEquation.getA() + " b = " + quadraticEquation.getB() + " c = " + quadraticEquation.getC());
        if (quadraticEquation.getDelta() > 0) {
            System.out.print("Phuong trnh co 2 nghiem : " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDelta() == 0) {
            System.out.print("Phuong trinh co nghiem duy nhat " + (-b / 2 * a));
        } else {
            System.out.print("Phuong trinh vo nghiem .");
        }

    }
}
