package menu;

public class ThongTinMenu {

    public static void menu() {
        System.out.println("Chọn loại xe!");
        System.out.println("---------Menu---------");
        System.out.println("1.Xe Máy");
        System.out.println("2.Oto");
        System.out.println("0.Thoát");
    }

    public static void chonXeMay() {
        System.out.println("--------------------------");
        System.out.println("Chào mừng bạn đến quản lý xe máy :)))");
        System.out.println("---------Menu Xe Máy---------");
        System.out.println("1.Thêm thông tin xe máy");
        System.out.println("2.Tìm kiếm thông tin xe máy");
        System.out.println("3.Sửa thông tin xe máy");
        System.out.println("4.Xóa xe máy khỏi danh sách");
        System.out.println("5.In danh sách xe máy");
        System.out.println("0.Thoát");

    }

    public static void chonOto() {
        System.out.println("---------------------------");
        System.out.println("Chào mừng bạn đến quản lý Oto :)))");
        System.out.println("---------Menu Oto---------");
        System.out.println("1.Thêm thông tin O to");
        System.out.println("2.Tìm kiếm thông tin Oto");
        System.out.println("3.Sửa thông tin Oto");
        System.out.println("2.Xóa Oto khỏi danh sách");
        System.out.println("5.Thoát");
    }

}

