package thaotacfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
//        saveFile();
        readFile();
    }

    static void readFile() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("student.dat");
            ois = new ObjectInputStream(fis);
            List<StudentCodegym> students = (List<StudentCodegym>) ois.readObject();
            for (StudentCodegym std : students) {
                System.out.println(std);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static void saveFile() {
        List<StudentCodegym> list = new ArrayList<>();
        list.add(new StudentCodegym("Linh", "Hà Nội"));
        list.add(new StudentCodegym("Ngọc", "Hải Dương"));
        list.add(new StudentCodegym("Mạnh", "Hải Dương"));

        FileOutputStream fos = null;
        ObjectOutputStream oss = null;

        try {
            fos = new FileOutputStream("student.dat");
            oss = new ObjectOutputStream(fos);
            oss.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fos != null;
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
