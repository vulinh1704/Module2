package demDoiGiay;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class demDoiGiay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Nhap so chiec giay : ");
        int n = scanner.nextInt();
        Map<String[], Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Nhap chiec giay  " + i + " : ");
            String str = scanner1.nextLine().toLowerCase().trim();
            String[] strings = str.split(" ");
            boolean flag = false;
            for (String[] j : map.keySet()) {
                if (strings[0].equals(j[0]) && strings[1].equals(j[1])) {
                    map.replace(j, map.get(j) + 1);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                map.put(strings, 1);
            }
        }

        for (String[] key : map.keySet()) {
            System.out.println(Arrays.toString(key) + " : " + map.get(key));
        }

        int sum = 0;
        for (String[] arrR : map.keySet()) {
            if (arrR[0].equals("r")) {
                for(String[] arrL : map.keySet()) {
                    if (arrL[0].equals("l") && arrL[1].equals(arrR[1])) {
                        if (map.get(arrR) > map.get(arrL)) {
                            sum +=  map.get(arrL);
                        }
                        else if (map.get(arrR) < map.get(arrL)) {
                            sum +=  map.get(arrR);
                        }
                        else {
                            sum += map.get(arrR);
                        }
                        break;
                    }
                }
            }
        }
        System.out.println("Số đôi dày là: " + sum);
    }
}
