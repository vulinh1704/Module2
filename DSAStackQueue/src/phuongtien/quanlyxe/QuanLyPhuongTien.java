package phuongtien.quanlyxe;

import phuongtien.cacloaiphuongtien.PhuongTien;

import java.util.ArrayList;
import java.util.List;

public class QuanLyPhuongTien implements QuanLyXe<PhuongTien>{
    List<PhuongTien> list = new ArrayList<>();

    @Override
    public void them(PhuongTien phuongTien) {
        list.add(phuongTien);
    }

    @Override
    public void sua(String name, PhuongTien phuongTien) {
        list.set(timKiem(name), phuongTien);
    }

    @Override
    public void xoa(String name) {
        list.remove(timKiem(name));
    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getTen())) {
                return i;
            }
        }
        return -1;
    }

    public void sapXep() {

    }

    @Override
    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


}
