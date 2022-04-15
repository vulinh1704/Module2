package exercise;


import java.util.Scanner;
import java.util.Stack;

public class InvertElement {
    public static void main(String[] args) {
        Stack<Integer> number = new Stack<>();
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            if (n < 0) {
                System.out.println("Nhập lại !");
            }
            System.out.print("Nhập số phần tử muốn thêm : ");
            n = sc.nextInt();
        } while (n < 0);

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập element " + i + " : ");
            int e = sc.nextInt();
            number.push(e);
        }
        System.out.print("Mảng bạn vừa nhập : ");
        for (Integer element : number) {
            System.out.print(element + " ");
        }
        System.out.print("\nMảng sau khi đảo : ");
        while (!number.isEmpty()) {
            System.out.print(number.pop() + " ");
        }


        Stack<Character> string = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n-----------------------------");
        System.out.print("\nNhập chuỗi : ");
        String str = scanner.nextLine();
        System.out.print("Chuỗi trước khi đảo : ");
        for (int i = 0; i < str.length(); i++) {
            string.push(str.charAt(i));
        }
        for (Character element : string) {
            System.out.print(element + " ");
        }
        System.out.print("\nChuỗi sau khi đảo : ");
        while (!string.isEmpty()) {
            System.out.print(string.pop() + " ");
        }
    }
}
