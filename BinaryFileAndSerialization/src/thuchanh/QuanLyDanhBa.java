package thuchanh;

import java.util.ArrayList;
import java.util.List;

public class QuanLyDanhBa {
    private final List<DanhBa> list = new ArrayList<>();

    public void them(DanhBa danhBa) {
        list.add(danhBa);
    }

    public void sua(String soDienThoai, DanhBa danhBa) {
        if (timKiem(soDienThoai) == -1) {
            System.out.println("Không có người này trong danh bạ !");
        } else {
            list.set(timKiem(soDienThoai), danhBa);
        }
    }

    public void xoa(String soDienThoai) {
        if (timKiem(soDienThoai) == -1) {
            System.out.println("Không có người này trong danh bạ !");
        } else {
            list.remove(timKiem(soDienThoai));
        }
    }

    public int timKiem(String soDienThoai) {
        for (int i = 0; i < list.size(); i++) {
            if (soDienThoai == list.get(i).getSoDienThoai()) {
                return i;
            }
        }
        return -1;
    }

    public void layDanhBa(String soDienThoai) {
        if (timKiem(soDienThoai) == -1) {
            System.out.println("Không tìm thấy số điện thoại này!");
        } else {
            System.out.println(list.get(timKiem(soDienThoai)));
        }
    }
    public void timKiemChung(String soDienThoai){
        for (DanhBa db: list) {
            if(db.getSoDienThoai().contains(soDienThoai)){
                System.out.println(db);
            }
        }
    }

    public void hienThi() {
        for (DanhBa db : list) {
            System.out.println(db);
        }
        System.out.println("------------------");
    }

    public String hienThi2() {
        String str = "";
        for (DanhBa db : list) {
            str += db.getSoDienThoai() + "," + db.getNhom() + "," + db.getHoVaTen() + "," + db.getGioiTinh() +
                    "," + db.getDiaChi() + "," + db.getNgaySinh() + "," + db.getEmail() + "\n";
        }

        return str;
    }
}
