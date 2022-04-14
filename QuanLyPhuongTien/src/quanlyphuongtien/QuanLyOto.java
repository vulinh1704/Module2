package quanlyphuongtien;

import cacloaiinterface.QuanLyPhuongTien;
import phuongtien.Oto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuanLyOto implements QuanLyPhuongTien<Oto> {
    List<Oto> danhSach = new ArrayList<>();

    @Override
    public void them(Oto oto) {
        danhSach.add(oto);
    }

    @Override
    public void sua(String name, Oto oto) {
        danhSach.set(timKiem(name), oto);
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

    @Override
    public void sapXep() {
        Collections.sort(danhSach);
    }

    @Override
    public void print() {
        for (Oto xe : danhSach) {
            System.out.println(xe);
        }
        System.out.println("-----------------------------");
    }
}
