import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int n;
        int[] array = new int[30];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the number of elements of the array : ");
            n = scanner.nextInt();
        } while (n <= 0);
        System.out.println("Add element !");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element is " + i + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter additional index : ");
        int pos = scanner.nextInt();
        System.out.print("Enter the value of that element : ");
        int x = scanner.nextInt();
        System.out.print("Array after adding : ");
        n = insert(array, n, x, pos);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static int insert(int[] arr, int n, int x, int pos) {
        if (n >= 30) {
            return n;
        }
        if (pos < 0 || pos > n) {
            return n;
        }
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = x;
        return n + 1;
    }
}