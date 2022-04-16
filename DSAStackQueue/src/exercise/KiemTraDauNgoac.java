package exercise;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoac {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao bieu thuc : ");
        String str = scanner.nextLine();
        char s = '(';
        char s2 = ')';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == s) {
                stack.push(s);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == s2) {
                stack1.push(s2);
            }
        }

        if (stack.size() == stack1.size()) {
            System.out.println("Well!");
        } else {
            System.out.println("???");
        }
    }
}
