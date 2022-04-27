package docghidanhdachsinhvienrafilenhiphan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Linh", "Hà Nam"));
        students.add(new Student(2, "Nam", "Hà Nội"));
        students.add(new Student(1, "Hoàng", "Hà Nội"));
        students.add(new Student(1, "Sơn", "Nam Định"));
        students.add(new Student(1, "Bích", "Nghệ An"));
        writeToFile("student.txt", students);

        List<Student> studentsDataFromFile = readDataFromFile("student.txt");
        for (Student student: studentsDataFromFile) {
            System.out.println(student);
        }
    }
}
