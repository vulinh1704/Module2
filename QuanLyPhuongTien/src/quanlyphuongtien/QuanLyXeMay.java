package quanlyphuongtien;

import cacloaiinterface.QuanLyPhuongTien;
import phuongtien.XeMay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuanLyXeMay implements QuanLyPhuongTien<XeMay> {
    List<XeMay> danhSach = new ArrayList<>();

    @Override
    public void them(XeMay xeMay) {
        danhSach.add(xeMay);
    }

    @Override
    public void sua(String name, XeMay xeMay) {
        danhSach.set(timKiem(name), xeMay);
    }

    @Override
    public void xoa(String name) {
        danhSach.remove(timKiem(name));
    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getTen().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void timKiemThongTin(String name) {
        if(timKiem(name) == -1){
            System.out.println("Không có xe máy trong danh sách");
        } else {
            System.out.println(danhSach.get(timKiem(name)));
        }
    }

    @Override
    public void sapXep() {
        Collections.sort(danhSach);
    }

    @Override
    public void print() {
        for (XeMay xe : danhSach) {
            System.out.println(xe);
        }
        System.out.println("-----------------------------");
    }

    public boolean isEmpty() {
        if (danhSach.size() == 0) {
            return true;
        }
        return false;
    }
}
