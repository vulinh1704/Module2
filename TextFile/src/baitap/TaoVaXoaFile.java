package baitap;

import java.io.*;
import java.util.Scanner;

public class TaoVaXoaFile {
    public static void main(String[] args) {
        // Tạo file
//        File file = null;
//        boolean isCreat = false;
//        try {
//            file = new File("testTao.txt");
//            isCreat = file.createNewFile();
//            if(isCreat){
//                System.out.println("Đã tạo file thành công !");
//            } else  {
//                System.out.println("Tạo file thất bại ! ");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Xóa file
//        File file = null;
//        boolean isDelete = false;
//        try {
//            file = new File("testTao.txt");
//            isDelete = file.delete();
//            if (isDelete) {
//                System.out.println("Xóa file " + file.getName() +" thành công");
//            } else {
//                System.out.println("Xóa file " + file.getName() +" thất bại");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        // Ghi ra file với PrintWrite
//        File file = null;
//        PrintWriter printWriter = null;
//        try {
//            file = new File("myfile.txt");
//            if (!file.exists()) {
//                file.createNewFile();
//            }
////            FileWriter fw = new FileWriter(file , true);
////            BufferedWriter bw = new BufferedWriter(fw);
////            printWriter = new PrintWriter(bw);
////            printWriter.println("Hello World!");
////            printWriter.close();
//
//            PrintWriter prw = new PrintWriter(file);
//            prw.write("Hello World !");
//            prw.flush();
//            prw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        // Đọc file vói Scanner;
//        Scanner scanner = null;
//        try {
//            File file = new File("myfile.txt");
//            scanner = new Scanner(file);
//            while (scanner.hasNext()) {
//                System.out.println(scanner.nextLine());
//            }
//            scanner.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        //Ghi ra file với FileWrite;
//        File file = null;
//        try {
//            file = new File("myfile.txt");
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            FileWriter fw = new FileWriter(file , true);
//            fw.write("Hello World");
//            fw.close();


        // Đọc file với FileReader;
//            FileReader fileReader = new FileReader(file);
//            int i;
//            while ((i = fileReader.read()) != -1){
//                System.out.print((char) i);
//            }
//            fileReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Ghi ra file với bufferWrite
//        try {
////            File file = new File("myfile.txt");
////            if (!file.exists()) {
////                file.createNewFile();
////            }
////            FileWriter fw = new FileWriter(file , true);
////            BufferedWriter bw = new BufferedWriter(fw);
////            bw.write("Hello World");
////            bw.close();
//
//            // đọc file với BufferReader
//
//            FileReader fr = new FileReader("myfile.txt");
//            BufferedReader br = new BufferedReader(fr);
////            int i;
////            while ((i = br.read()) != -1){
////                System.out.print((char) i);
////            }
//
//            String line = br.readLine();
//            while ((line != null)) {
//                System.out.println(line);
//                line = br.readLine();
//            }
//            br.close();
//            fr.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
