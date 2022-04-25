package thaotacfile;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputstreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("test.txt");
//            int code = fis.read();
//            char c = (char) code;
//            System.out.println("c >> " + c);
            StringBuilder builder = new StringBuilder();
            int code;
            while ((code = fis.read()) != -1){
                builder.append((char) code);
            }

            String content = builder.toString();
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fis != null;
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
