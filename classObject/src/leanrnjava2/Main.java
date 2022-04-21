package leanrnjava2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner input = new Scanner(System.in);
        StringBuilder buider = new StringBuilder();
        buider.append("12");
        buider.append("34");
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println("Nhap phan tu thu i : " + i);
                arr[i] = input.nextInt();
            }
        } catch (Exception e) {
//            e.printStackTrace();
        } finally {
            System.out.println("finish 1");
        }

        try {
            for (int j : arr) {
                System.out.println(j);
            }
        } catch (Exception e) {
//            e.printStackTrace();
        } finally {
            System.out.println("finish 1 ");
        }

    }
}
