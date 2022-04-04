import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Linear Equation Resolver");
        System.out.println("Cho Phuong trinh ax + b = 0 , vui long nhap a , b ;");
        System.out.print("Enter a : ");
        double a = scanner.nextDouble();
        System.out.print("Enter b : ");
        double b = scanner.nextDouble();

        if (a != 0) {
            System.out.printf("Phuong trinh co nghiem duy nhat x = %f !" , -b / a);
        } else {
            if(b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
