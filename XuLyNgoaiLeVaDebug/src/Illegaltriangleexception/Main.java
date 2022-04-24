package Illegaltriangleexception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleEdgesCheck check = new TriangleEdgesCheck();
        try {
            System.out.print("Nhap vao canh thu nhat: ");
            int a = scanner.nextInt();
            System.out.print("Nhap vao canh thu hai: ");
            int b = scanner.nextInt();
            System.out.print("Nhap vao canh thu ba: ");
            int c = scanner.nextInt();
            try {
                check.checkTriangleEdges(a, b, c);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Không đúng định dạng ! ");
        }
        scanner.close();
    }
}
