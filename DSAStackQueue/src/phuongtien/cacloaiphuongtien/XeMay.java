package phuongtien.cacloaiphuongtien;

import phuongtien.cacloaiphuongtien.PhuongTien;

public class XeMay extends PhuongTien {
    private int dungTich;

    public XeMay() {
    }

    public XeMay(String hang, String mau, String ten, int gia, int dungTich) {
        super(hang, mau, ten, gia);
        this.dungTich = dungTich;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    @Override
    public String toString() {
        return "XeMay{ " +
                " ten = " + getTen() +
                " gia = " + getGia() +
                " dungTich = " + dungTich +
                '}';
    }

    @Override
    public int compareTo(PhuongTien o) {
        return this.getGia() - o.getGia();
    }
}
