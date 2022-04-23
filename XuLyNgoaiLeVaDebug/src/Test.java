import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        try {
            System.out.println("Nhap vao so nguyen n : ");
            n = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Nhap du lieu k dung ");
        } finally {
            System.out.println("Nhap du leu k dung ");
        }
        System.out.println("Gia tri nhap la : " + n);
        System.out.println("Ket thuc chuong trinh");
    }
}
