import java.util.Scanner;

public class DemLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = scanner.nextLine();
        System.out.print("Enter a char : ");
        String key = scanner.nextLine();
        char c = key.charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==c) {
                count++;
            }
        }
        System.out.println(count + " la so lan xuat hien trong chuoi");
    }
}
