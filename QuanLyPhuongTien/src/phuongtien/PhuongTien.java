package phuongtien;

public abstract class PhuongTien {
    private String hang;
    private String color;
    private String ten;
    private int gia;

    public PhuongTien() {
    }

    public PhuongTien(String hang, String color, String ten, int gia) {
        this.hang = hang;
        this.color = color;
        this.ten = ten;
        this.gia = gia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
