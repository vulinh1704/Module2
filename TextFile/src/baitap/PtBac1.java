package baitap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PtBac1 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        double x = 0;
        try {
            Scanner scanner = new Scanner(file);
            String[] arr = (scanner.nextLine()).split(" ");
            x = Double.parseDouble(arr[1]) / Double.parseDouble(arr[0]);
            double sum = 0;
            double pos = 1;
            double max = Double.parseDouble(arr[0]);
            double min = Double.parseDouble(arr[0]);
            for (String e: arr) {
                sum += Double.parseDouble(e);
                pos *= Double.parseDouble(e);
                if(Double.parseDouble(e) > max){
                    max = Double.parseDouble(e);
                }
                if(Double.parseDouble(e) < min){
                    min = Double.parseDouble(e);
                }
            }
            PrintWriter pr = new PrintWriter("rs.txt");
            pr.println(x);
            pr.println(sum);
            pr.println(pos);
            pr.println(max);
            pr.println(min);
            pr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
