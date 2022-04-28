package thuchanh;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class XuLyMenu {
    public static QuanLyDanhBa quanLyDanhBa = new QuanLyDanhBa();

    public static void xulyMenuChinh() {
        int choose = 1;
        do {
            Menu.hienThiMenuChinh();
            Scanner scanner = new Scanner(System.in);
            choose = getChoose(choose, scanner);
            switch (choose) {
                case 1:
                    quanLyDanhBa.hienThi();
                    break;
                case 2:
                    chucNangThem();
                    break;
                case 3:
                    chucNangCapNhat();
                    break;
                case 4:
                    chucNangXoa();
                    break;
                case 5:
                    chucNangTimKiem();
                    break;
                case 6:
                    try {
                        chucNangDocVaoFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    try {
                        chucNangGhiVaoFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 8:
                    System.exit(0);
            }
        } while (true);
    }

    private static int getChoose(int choose, Scanner scanner) {
        do {
            if (choose < 1 || choose > 8) {
                Menu.hienThiMenuChinh();
                System.out.println("Vui lòng nhập lựa chọn trong menu!");
            }
            try {
                choose = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Nhập đúng lựa chọn đi bro!");
                scanner.nextLine();
                choose = -1;
            }
        } while (choose < 1 || choose > 8);
        return choose;
    }

    public static void chucNangThem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại");
        String soDienTHoai = scanner.nextLine();
        System.out.println("Nhập nhóm");
        String nhom = scanner.nextLine();
        System.out.println("Nhập họ và tên");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String ngaySinh = scanner.nextLine();
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        DanhBa danhBa = new DanhBa(soDienTHoai, nhom, hoTen, gioiTinh, diaChi, ngaySinh, email);
        quanLyDanhBa.them(danhBa);
    }

    public static void chucNangCapNhat() {
        Scanner scanner = new Scanner(System.in);
        String soDienThoaiSua = "";
        do {
            if ((quanLyDanhBa.timKiem(soDienThoaiSua) == -1)) {
                System.out.println("Vui lòng nhập đúng số cần sửa");
            }
            soDienThoaiSua = scanner.nextLine();
        } while (quanLyDanhBa.timKiem(soDienThoaiSua) == -1);
        System.out.println("Nhập danh bạ cần cập nhật");
        System.out.println("Nhập số điện thoại mới ");
        String soDienTHoai = scanner.nextLine();
        System.out.println("Nhập nhóm mới");
        String nhom = scanner.nextLine();
        System.out.println("Nhập họ và tên mới");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập giới tính mới");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ mới");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập ngày sinh mới");
        String ngaySinh = scanner.nextLine();
        System.out.println("Nhập email mới");
        String email = scanner.nextLine();
        DanhBa danhBa = new DanhBa(soDienTHoai, nhom, hoTen, gioiTinh, diaChi, ngaySinh, email);
        quanLyDanhBa.sua(soDienThoaiSua, danhBa);
    }

    public static void chucNangXoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại cần xóa");
        String soDienThoai = scanner.nextLine();
        quanLyDanhBa.xoa(soDienThoai);
    }

    public static void chucNangTimKiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại cần tìm");
        String soDienThoai = scanner.nextLine();
        quanLyDanhBa.layDanhBa(soDienThoai);
    }

    public static void chucNangDocVaoFile() throws IOException {
        FileReader fr = new FileReader("contacts.csv");
        BufferedReader br = new BufferedReader(fr);
        String content = br.readLine();
        while ((content = br.readLine()) != null) {
            System.out.println(content + "\n");
        }
    }

    public static void chucNangGhiVaoFile() throws IOException {
        FileWriter pw = new FileWriter("contacts.csv");
        BufferedWriter bw = new BufferedWriter(pw);
        bw.write(quanLyDanhBa.hienThi2());
        bw.close();
    }

}
