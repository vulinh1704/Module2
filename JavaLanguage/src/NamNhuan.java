import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 != 0) {
                    System.out.println("khong phai nam nhuan");
                } else {
                    System.out.println("La nam nhuan");
                }
            } else {
                System.out.println("La nam nhuan");
            }
        }
    }
}
