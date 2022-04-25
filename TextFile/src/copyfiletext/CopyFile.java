package copyfiletext;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        File source = new File("test.txt");
        File target = new File("vidu.txt");
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(target);
            byte[] buffer = new byte[1024];
            int length;
            int count = 0;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            for (byte b: buffer) {
                if(b != 0) count++;
            }
            System.out.println("Số kí tự trong tập tin : " + count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                is.close();
            }
            if (os != null) {
                os.close();
            }
        }
    }


}
