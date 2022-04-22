package studentmanagement;

public interface StudentManagement<T> {
    void add(T t);

    void edit(String id, T t);

    void remove(String id);

    int search(String id);

    void display();
}
