import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int s;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the number of elements of the array : ");
            s = scanner.nextInt();
        } while (s <= 0);
        array = new int[30];
        System.out.println("Add element !");
        for (int i = 0; i < s; i++) {
            System.out.print("Enter Element is " + i + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the element you want to delete : ");
        int a = scanner.nextInt();
        s = deleteElement(array, s, a);
        System.out.println("size");
        System.out.println("Array after deleting : ");
        for (int i = 0; i < s; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static int searchElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int deleteElement(int[] arr, int n, int key) {
        int pos = searchElement(arr, key);
        if (pos == -1) {
            System.out.println("No Find Element in Array !");
        }
        for (int i = pos; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }
}
