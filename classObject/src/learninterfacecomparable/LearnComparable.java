package learninterfacecomparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class LearnComparable {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("C0222H1", "Truong Dang Vu Linh", "Ha Nam", 20, 10.0f));
        students.add(new Student("C0222H2", "Truong Hong Anh", "Ha Noi", 19, 9.3f));
        students.add(new Student("C0222H6", "Nguyen Linh", "Ha Nam", 20, 7.3f));
        students.add(new Student("C0222H4", "Truong Dang", "Hai Phong", 24, 7.0f));

        Collections.sort(students);
        showInfor(students);
    }

    public static void showInfor(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
