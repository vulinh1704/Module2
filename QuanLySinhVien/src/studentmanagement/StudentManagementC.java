package studentmanagement;

import sudent.StudentB;
import sudent.StudentC;

import java.util.ArrayList;

public class StudentManagementC implements StudentManagement<StudentC> {
    private ArrayList<StudentC> list = new ArrayList<>();

    @Override
    public void add(StudentC studentC) {
        list.add(studentC);
    }

    @Override
    public void edit(String id, StudentC studentC) {
        if (search(id) == -1) {
            System.out.println("Không có sinh viên này trong danh sách !");
        } else {
            list.set(search(id), studentC);
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
        for (StudentC e : list) {
            System.out.println(e);
        }
        System.out.println("--------------------");
    }
}
