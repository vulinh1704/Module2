public class SinhVien {
    private int maSV;
    private String ten;
    private int tuoi;

    public SinhVien() {
    }
}
class QuanLySV {
    private SinhVien[] mangSV;
    QuanLySV() {
    }

    QuanLySV(SinhVien[] mangSV) {
        this.mangSV = mangSV;
    }

    public SinhVien[] getMangSV() {
        return mangSV;
    }

    public void setMangSV(SinhVien[] mangSV) {
        this.mangSV = mangSV;
    }

    public void them(){
    }
    public void sua(){

    }
    public void xoa(){
    }
    public SinhVien timKiem(){
        return new SinhVien();
    }
}