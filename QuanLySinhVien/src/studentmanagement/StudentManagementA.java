package studentmanagement;

import student.Student;
import student.StudentA;

import java.util.ArrayList;

public class StudentManagementA implements StudentManagement<StudentA> {
    private final ArrayList<StudentA> list = new ArrayList<>();

    @Override
    public void add(StudentA studentA) {
        list.add(studentA);
    }

    @Override
    public void edit(String id, StudentA studentA) {
        if (search(id) == -1) {
            System.out.println("Không có sinh viên này trong danh sách !");
        } else {
            list.set(search(id), studentA);
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
        for (StudentA e : list) {
            System.out.println(e);
        }
        System.out.println("--------------------");
    }
}
