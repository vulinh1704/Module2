package studentmanagement;

import sudent.StudentA;
import sudent.StudentB;

import java.util.ArrayList;

public class StudentManagementB implements StudentManagement<StudentB> {
    private ArrayList<StudentB> list = new ArrayList<>();

    @Override
    public void add(StudentB studentB) {
        list.add(studentB);
    }

    @Override
    public void edit(String id, StudentB studentB) {
        if (search(id) == -1) {
            System.out.println("Không có sinh viên này trong danh sách !");
        } else {
            list.set(search(id), studentB);
        }
    }

    @Override
    public void remove(String id) {
        if (search(id) == -1) {
            System.out.println("Không có sinh viên này trong danh sách !");
        } else {
            list.remove(list.get(search(id)));
        }

    }

    @Override
    public int search(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void display() {
        for (StudentB e : list) {
            System.out.println(e);
        }
        System.out.println("--------------------");
    }
}
