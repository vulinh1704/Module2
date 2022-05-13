package xaydungcrawl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class DemoUsingURL {
    private static String getContentFrom(String link) throws IOException {
        // Gởi HTTP request và nhận về kết quả là chuỗi các thẻ HTML
        URL url = new URL(link);
        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\Z");
        String content = scanner.next();
        scanner.close();
        // xoá các ký tự ngắt dòng (xuống dòng)
        content = content.replaceAll("\\n", "");
        return content;
    }

    public static void main(String[] args) throws IOException {
        String content = getContentFrom("https://nchmf.gov.vn/Kttvsite/vi-VN/1/ha-noi-w28.html");
        // Regex
        Pattern p = Pattern.compile("<a href=\"#\">(.*?)</a>");
        Matcher m = p.matcher(content);
        while (m.find()) {
            System.out.println(m.group(1));
        }
    }
}
