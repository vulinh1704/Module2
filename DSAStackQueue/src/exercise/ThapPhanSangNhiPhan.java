package exercise;

import java.util.Scanner;
import java.util.Stack;

public class ThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri thap phan : ");
        Stack<Integer> stack = new Stack<>();
        int num = scanner.nextInt();
        while (num != 0) {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        System.out.print("\nGia tri nhi phan la : ");
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }

        System.out.print("\nNhap gia tri nhi phan : ");
        int num1 = scanner.nextInt();
        int sum = 0;
        int p = 0;
        while (true) {
            if (num1 == 0) {
                break;
            } else {
                int temp = num1 % 10;
                sum += temp * Math.pow(p, 2);
                num1 = num1 / 10;
                p++;
            }
        }
        System.out.println("Gia tri thap phan : " + sum);
    }
}
