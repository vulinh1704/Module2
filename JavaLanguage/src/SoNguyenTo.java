import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int count = 0;
        for(int i = 1; i <= num ; i++){
            if (num % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println(num + " la so nguyen to");
        } else {
            System.out.println(num + " khong la so nguyen to");
        }
    }
}
