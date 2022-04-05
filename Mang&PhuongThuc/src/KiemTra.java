import java.util.Scanner;

public class KiemTra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        System.out.println("Enter Array : ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element " + i + " : ");
            array[i] = scanner.nextInt();
        }

        // in ra sum chan
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println("Tong chan : " + sum);

        // nhap vao a tim vi tri as trong mang
        System.out.print("Enter a : ");
        int a = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (array[i] == a) {
                System.out.print("Index a in Array : " + i);
            }
        }

        //nhap a , xoa a khoi mang;
        int[] b = new int[n - 1];
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                c = i;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (c < i) {
                b[i] = array[i];
            } else {
                b[i] = array[i + 1];
            }
        }
        System.out.println("\nArray new : ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        int[] d = new int[array.length + 1];
        for (int i = 0; i < d.length; i++) {
            if (i < c) {
                d[i] = array[i];
            }
            d[c] = a;
            if (i > c) {
                d[i] = array[i - 1];
            }
        }
        System.out.println("\nArray sau add : ");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }

    }
}
