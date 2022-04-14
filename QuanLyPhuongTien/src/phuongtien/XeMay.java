package phuongtien;

public class XeMay extends PhuongTien implements Comparable<XeMay> {
    private int dungTich;

    public XeMay() {
    }

    public XeMay(String hang, String color, String ten, int gia, int dungTich) {
        super(hang, color, ten, gia);
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
        return " Xe máy : " +
                " tên " + getTen() +
                " và có dung tích " + dungTich +
                " và có giá " + getGia();
    }

    @Override
    public int compareTo(XeMay o) {
        return this.getGia() - o.getGia();
    }
}
