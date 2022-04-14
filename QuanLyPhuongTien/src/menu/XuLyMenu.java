package menu;

import phuongtien.XeMay;
import quanlyphuongtien.QuanLyXeMay;
import quanlytaikhoan.TaiKhoan;

import java.util.Scanner;

public class XuLyMenu {
    private int luaChon;
    private QuanLyXeMay ql = new QuanLyXeMay();

    public void setLuaChon(int luaChon) {
        switch (luaChon) {
            case 1:
                ThongTinMenu.chonXeMay();
                break;
            case 2:
                ThongTinMenu.chonOto();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Không có trong menu vui lòng chọn lại!");
        }
    }

    public void chonXeMay(int luaChon) {
//        if (ql.isEmpty() && luaChon != 1 && luaChon != 0) {
//            System.out.println("Danh sách xe máy trống vui lòng nhập 1");
//        } else {
        switch (luaChon) {
            case 1:
                ql.them(themXeMay());
                break;
            case 2:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập tên : ");
                String name = scanner.nextLine();
                timThongTin(name);
                break;
            case 3:
                System.out.println("Nhập thông tin xe máy mới : ");
                XeMay xeMay1 = themXeMay();
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập tên cần xóa : ");
                String name1 = sc.nextLine();
                ql.sua(name1, xeMay1);
                break;
            case 4:
                System.out.println("Nhập thông tin xe máy cần xóa : ");
                Scanner sc1 = new Scanner(System.in);
                String name2 = sc1.nextLine();
                ql.xoa(name2);
                break;
            case 5:
                ql.print();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Không có trong menu vui lòng chọn lại!");
        }
    }


    public XeMay themXeMay() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Hãng : ");
        String hang = sc.next();
        System.out.print("Nhập Màu : ");
        String mau = sc.next();
        System.out.print("Nhập Tên : ");
        String ten = sc.next();
        System.out.print("Nhập Giá : ");
        int gia = sc.nextInt();
        System.out.print("Nhập dung tích : ");
        int dungTich = sc.nextInt();
        XeMay xeMay = new XeMay(hang, mau, ten, gia, dungTich);
        return xeMay;
    }

    public void timThongTin(String name) {
        ql.timKiemThongTin(name);
    }

    public TaiKhoan dangKi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Đăng kí Tài Khoản : ");
        String tk = scanner.nextLine();
        System.out.println("Đăng kí mật khẩu : ");
        String mk = scanner.nextLine();
        return new TaiKhoan(tk, mk);
    }

    public boolean kiemTraDangNhap(String tk , String mk , TaiKhoan taiKhoan) {
        if(tk.equals(taiKhoan.getTenTaiKhoan()) && mk.equals(taiKhoan.getMatKhau())){
            System.out.println("Chúc mừng bạn đã đăng nhập thành công!\n");
        }else{
            System.out.println("Nhập lại!");
        }
        return tk.equals(taiKhoan.getTenTaiKhoan()) && mk.equals(taiKhoan.getMatKhau());
    }

    public String dangNhapTk() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Đăng nhập tài khoản: ");
        String tk = scanner.nextLine();
        return tk;
    }

    public String dangNhapMk() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Đăng nhập tài khoản: ");
        String mk = scanner.nextLine();
        return mk;
    }


}
