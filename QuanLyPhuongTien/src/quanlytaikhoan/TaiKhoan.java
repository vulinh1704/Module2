package quanlytaikhoan;

public class TaiKhoan {
    private String TenTaiKhoan;
    private String MatKhau;

    public TaiKhoan() {
    }

    public TaiKhoan(String tenTaiKhoan, String matKhau) {
        TenTaiKhoan = tenTaiKhoan;
        MatKhau = matKhau;
    }

    public String getTenTaiKhoan() {
        return TenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        TenTaiKhoan = tenTaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }
}
