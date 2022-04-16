package usemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class UseMap {
    public static void main(String[] args) {
        // hash map
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Linh", 30);
        hashMap.put("Manh", 29);
        hashMap.put("Huyen", 34);
        hashMap.put("Ngoc", 29);
        System.out.println("Hiển thị các mục trong hash map : ");
        System.out.println(hashMap + "\n");

        // tree map theo thu tu giam dan
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Alice", 13);
        treeMap.put("Juliet", 12);
        treeMap.put("Jax", 43);
        treeMap.put("Denlta", 10);
        System.out.println("Hiển thị các mục nhập theo thứ tự tăng dần của khóa : ");
        System.out.println(treeMap);

        // Tao linkedHashMap luu tru sinh vien va hien thi du lieu
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16 ,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nTuổi của Lewis là :  " + linkedHashMap.get("Lewis"));
    }
}
