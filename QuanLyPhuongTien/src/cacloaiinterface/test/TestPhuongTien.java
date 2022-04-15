package cacloaiinterface.test;

import menu.XuLyMenu;
import menu.ThongTinMenu;
import quanlytaikhoan.TaiKhoan;

import java.util.Scanner;

public class TestPhuongTien {
    public static void main(String[] args) {
        XuLyMenu dk = new XuLyMenu();
        System.out.println("------Đăng Ký---- ");
        TaiKhoan taiKhoan = dk.dangKi();
        String tk, mk;
        System.out.println("\n------Đăng Nhập------");
        do {
            tk = dk.dangNhapTk();
            mk = dk.dangNhapMk();
        } while (!dk.kiemTraDangNhap(tk, mk, taiKhoan));

        ThongTinMenu.menu();
        Scanner sc = new Scanner(System.in);
        XuLyMenu lc = new XuLyMenu();
        int chon;

        do {
            chon = sc.nextInt();
            lc.setLuaChon(chon);
        } while (chon != 0 && chon != 1 && chon != 2);
        System.out.println("-----------------------");


        do {
            chon = sc.nextInt();
            lc.chonXeMay(chon);
            ThongTinMenu.chonXeMay();
        } while (chon != 0);
    }

}
