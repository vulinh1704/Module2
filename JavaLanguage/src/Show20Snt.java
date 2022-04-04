import java.util.Scanner;

public class Show20Snt {
    public static void main(String[] args) {
        int count2 = 0;
        for (int i = 1; ; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
                count2++;
            }
            if (count2 == 20) break;
        }
    }
}
