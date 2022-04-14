package phuongtien;

public class Oto extends PhuongTien implements Comparable<Oto> {
    private int soCho;

    public Oto() {
    }

    public Oto(String hang, String color, String ten, int gia) {
        super(hang, color, ten, gia);
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    @Override
    public String toString() {
        return " Oto { " +
                " Ten = " + getTen() +
                " So Cho = " + soCho +
                " Gia = " + getGia() +
                "}";
    }

    @Override
    public int compareTo(Oto o) {
        return this.getGia() - o.getGia();
    }
}
