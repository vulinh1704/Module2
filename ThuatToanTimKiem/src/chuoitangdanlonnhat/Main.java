package chuoitangdanlonnhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi : ");
        String string = scanner.nextLine();
        LinkedList<Character> stringMax = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); i++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > stringMax.size()) {
                stringMax.clear();
                stringMax.addAll(list);
            }
            list.clear();
        }
        for (Character e : stringMax) {
            System.out.print(e);
        }
        System.out.println();
    }
}

// Tính độ phực tạp của thuật toán :
// 1 vòng lặp ngoài = n;
// 1 vòng lặp bên trong = n - 1;
// 1 câu lệnh  = 1;
// 1 vòng lặp * 1 câu lệnh = 1;
// T(n) = (n * (n - 1)) + ( 1 + 1);
// T(n) = O(n^2) + O(n);
//      T(n) = O(n^2);
//      => Độ phức tạp bài toán này là O(n^2);