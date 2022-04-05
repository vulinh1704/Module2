import java.util.Scanner;

public class DemSinhVien {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap so sinh vien : ");
            size = scanner.nextInt();
        } while (size <= 0 || size > 30);
        int[] array = new int[size];
        System.out.println("Add Point thang 10 !");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Add Element is " + i +" : ");
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int j : array) {
            if (j >= 5) count++;
        }
        System.out.println("So dinh vien dat : " + count);

    }
}
