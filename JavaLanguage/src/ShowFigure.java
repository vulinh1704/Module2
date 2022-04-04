import java.util.Scanner;

public class ShowFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Ve hinh chu nhat");
        System.out.println("2.Ve hinh tam giac");
        System.out.println("3.Ve hinh tam giac nguoc");
        System.out.println("4.Exit");
        System.out.print("Enter choice : ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("*\t");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5; j++) {
                        if (i >= j) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5; j++) {
                        if (i <= j) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("No Choice !");
        }
    }
}
