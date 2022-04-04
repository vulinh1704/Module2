import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        double f;
        double c;
        do {
            System.out.println("-------Menu------");
            System.out.println("1. celsius To Celsius ");
            System.out.println("2. fahrenheit To Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter to Celsius : ");
                    f = scanner.nextDouble();
                    System.out.println("celsius To Fahrenheit " + celsiusToFahrenheit(f));
                    break;
                case 2:
                    System.out.print("Enter to Fahrenheit : ");
                    c = scanner.nextDouble();
                    System.out.println("fahrenheit To Fahrenheit " + fahrenheitToCelsius(c));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No Choice !");
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double C) {
        double F = C - (5.0 / 9) + 32;
        return F;
    }

    public static double fahrenheitToCelsius(double F) {
        double C = (5.0 / 9) * (F - 32);
        return C;
    }

}
