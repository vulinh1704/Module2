package phuongtien.quanlyxe;

import phuongtien.cacloaiphuongtien.Oto;
import phuongtien.cacloaiphuongtien.PhuongTien;
import phuongtien.cacloaiphuongtien.XeMay;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        QuanLyPhuongTien ql = new QuanLyPhuongTien();
        PhuongTien pt = new XeMay("fas" , " sda" , "fe12323" , 43, 54);
        PhuongTien pt1 = new Oto("fas" , " sda" , "fe" , 43, 54);
        PhuongTien pt2 = new XeMay("s" , " da" , "kkk" , 4, 54);
        ql.them(pt);
        ql.them(pt1);
//        ql.xoa("fe");
        ql.sua("fe" , pt2);
        ql.print();
        ql.print();
    }
}
