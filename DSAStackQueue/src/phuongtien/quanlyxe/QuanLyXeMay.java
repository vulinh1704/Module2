package phuongtien.quanlyxe;

import phuongtien.cacloaiphuongtien.XeMay;

import java.util.Arrays;

public class QuanLyXeMay implements QuanLyXe<XeMay>{
    private XeMay[] danhSach = new XeMay[3];
    private int size = 0;
    @Override
    public void them(XeMay xeMay) {
        danhSach[size] = xeMay;
        size++;
    }

    @Override
    public void sua(String name, XeMay xeMay) {
        danhSach[timKiem(name)] = xeMay;
    }

    @Override
    public void xoa(String name) {
        for (int i = timKiem(name); i < danhSach.length; i++) {
            danhSach[i] = danhSach[i+1];
        }
        danhSach[danhSach.length - 1] = null;
        danhSach.
    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < size; i++) {
            if(danhSach[i].getTen() == name){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sapXep() {
        Arrays.sort(danhSach);
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("----------------------------------");
    }
}
