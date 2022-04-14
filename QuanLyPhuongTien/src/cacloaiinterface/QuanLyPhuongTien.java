package cacloaiinterface;

public interface QuanLyPhuongTien<T> {
    void them(T t);

    void sua(String name, T t);

    void xoa(String name);

    int timKiem(String name);

    void sapXep();

    void print();
}
