import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month : ");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("The month has 28 or 29 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                System.out.print("The Month " + month + " has 31 days");
                break;
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
                System.out.print("The Month " + month + " has 30 days");
                break;
            default:
                System.out.print("this month " + month + " doesn't exist");

        }
    }
}
