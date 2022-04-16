package exercise;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Nhap chuoi can kiem tra : ");
        Scanner sc = new Scanner(System.in);
        String ipString = sc.nextLine();
        Queue queue = new LinkedList();
        for(int i = ipString.length() - 1 ; i >= 0; i--){
            queue.add(ipString.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()){
            reverseString = reverseString + queue.remove();
        }
        if(reverseString.equals(ipString)){
            System.out.println("Day la chuoi doi xung!");
        } else {
            System.out.println("Khong la chuoi doi xung!");
        }
    }
}
