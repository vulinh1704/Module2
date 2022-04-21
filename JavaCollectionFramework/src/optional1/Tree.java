package optional1;

public interface Tree<E> {
    //    Chèn phần tử e vào cây tìm kiếm nhị phân.
    //    Trả về true nếu phần tử được chèn thành công.
    boolean insert(E e);

    void inorder();

    int getSize();

}
