package thaotacfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileAndFileoutputstream {
    public static void main(String[] args) {
        // Phan 1 : File Class
        File file = new File("vidu.txt");
        if(file.exists()){
            System.out.println("File exist");
        } else {
            try {
                file.createNewFile();
            } catch (IOException ex){
            }
            System.out.println("File not found");
        }

        //Phan 2 : Ghi du lieu vao file
        FileOutputStream fos = null;
        Scanner scanner = new Scanner(System.in);
        try {
            fos = new FileOutputStream("test.txt");
//            String line = "Trong Dang VU Linh";
//            byte[] b = line.getBytes(StandardCharsets.UTF_8);
//            fos.write(b);
            do {
                System.out.println("Nhập vào :");
                String line = scanner.nextLine() + "\n";
                byte[] b = line.getBytes(StandardCharsets.UTF_8);
                fos.write(b);
                System.out.println("Continue ? (Y/N)");
                String choose = scanner.nextLine();
                if(choose.equals("N")){
                    break;
                }
            } while (true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
