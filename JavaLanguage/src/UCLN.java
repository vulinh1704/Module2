import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = scanner.nextInt();
        System.out.print("Enter b : ");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        int ucln = 1;
        if(a == 0 || b == 0){
            System.out.println("No greatest common factor");
        } else {
            for(int i = 1 ; i <= a && i <= b ; i++){
                if(a % i == 0 && b % i == 0){
                    ucln = i;
                }
            }
            System.out.println("Greatest common factor: " + ucln);
        }
    }
}
