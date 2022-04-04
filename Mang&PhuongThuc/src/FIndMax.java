import java.util.Scanner;

public class FIndMax {
    public static void main(String[] args) {
        int size;
        int[] array;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size : ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size < 20!");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Element in Array : ");
        for (int k : array) {
            System.out.print(k + "\t");
        }
        for (int j : array) {
            max = array[0];
            if (j > max) {
                max = j;
            }
        }

        System.out.println("\nElement Max in Array : " + max);
    }
}
