import java.util.Scanner;

public class ChuyenTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter USD : ");
        double USD = scanner.nextDouble();
        double VND = 23000 * USD;
        System.out.println(USD + " USD = " + VND + " VND");
    }
}
