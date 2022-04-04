import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Width : ");
        double width = scanner.nextDouble();
        System.out.print("Enter Height : ");
        double height = scanner.nextDouble();
        System.out.println("S = " + width * height);
    }
}
