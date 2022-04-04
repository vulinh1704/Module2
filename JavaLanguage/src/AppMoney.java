import java.util.Scanner;

public class AppMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tien gui : ");
        double so_tien_gui = scanner.nextDouble();
        System.out.print("Nhap so thang gui : ");
        int so_thang_gui = scanner.nextInt();
        System.out.print("Nhap lai suat : ");
        double lai_suat_nhan_duoc = scanner.nextDouble();
        double so_tien_lai = so_tien_gui * (lai_suat_nhan_duoc / 100) / 12 * so_thang_gui;
        System.out.println("So tien lai : " + so_tien_lai);
    }
}
