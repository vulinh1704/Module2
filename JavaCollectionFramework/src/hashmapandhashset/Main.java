package hashmapandhashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Hung", 21, "HCM");
        Student student3 = new Student("Viet", 25, "HP");
        Map<Integer, Student> studentHashMap = new HashMap<>();
        studentHashMap.put(1, student1);
        studentHashMap.put(2, student2);
        studentHashMap.put(3, student3);
        studentHashMap.put(4, student1);
        for (Map.Entry<Integer, Student> student : studentHashMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println(".............Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for (Student student : students) {
            System.out.println(student.toString());
        }

    }
}
