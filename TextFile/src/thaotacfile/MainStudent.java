package thaotacfile;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        List<StudentCodegym>  list = new ArrayList<>();
        list.add(new StudentCodegym("Linh" , "Hà Nội"));
        list.add(new StudentCodegym("Ngọc" , "Hải Dương"));
        list.add(new StudentCodegym("Mạnh" , "Hải Dương"));

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("student.txt");
            String line = StudentCodegym.getFileHeader() + "\n";
            byte[] b = line.getBytes(StandardCharsets.UTF_8);
            fos.write(b);
            for (StudentCodegym st : list) {
                line = st.toString() + "\n";
                b = line.getBytes(StandardCharsets.UTF_8);
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
