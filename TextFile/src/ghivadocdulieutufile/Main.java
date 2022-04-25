package ghivadocdulieutufile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //1. Write string or array
    //2. Write object or list object
    //3. Read data from file
    public void writeToFile(List<Student> list) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (Student student : list) {
                bw.write(student.toString());
                bw.newLine();
            }

            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Student> readFromFile() {
        List<Student> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] txt = line.split(";");
                String name = txt[0];
                int age = Integer.parseInt(txt[1]);
                double mark = Double.parseDouble(txt[2]);
                list.add(new Student(name, age, mark));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        Main main = new Main();
//        List<Student> listS = new ArrayList<>();
//        Student student = new Student("Nguyen Van A", 22, 6.7);
//        Student student1 = new Student("Nguyen Van A", 22, 6.7);
//        Student student2 = new Student("Nguyen Van A", 22, 6.7);
//        listS.add(student);
//        listS.add(student1);
//        listS.add(student2);
//        main.writeToFile(listS);
        List<Student> list = main.readFromFile();
        for (Student o : list) {
            System.out.println(o);
        }
    }

}
