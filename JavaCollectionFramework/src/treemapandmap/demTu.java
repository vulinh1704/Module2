package treemapandmap;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class demTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi : ");
        String str = scanner.nextLine();
        Map<String, Integer> map = new TreeMap<>();
        String temp = "";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                temp += str.charAt(i) + "";
            }
            if (str.charAt(i) == ' ' || i == str.length() - 1) {
                sum++;
                if (map.containsKey(temp)) {
                    int count = map.get(temp) + 1;
                    map.put(temp, count);
                } else {
                    map.put(temp, 1);
                }
                temp = "";
            }
        }
        Set<String> keySet = map.keySet();
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        System.out.print("Cac phan tu ap dao: ");
        for (String key : keySet) {
            if (map.get(key) > sum/2) {
                System.out.println(" "+key);
            }
        }
    }
}
