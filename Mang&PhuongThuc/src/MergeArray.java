import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size1, size2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size Array 1 : ");
            size1 = scanner.nextInt();
            System.out.print("Enter a size Array 2 : ");
            size2 = scanner.nextInt();
        } while (size1 <= 0 || size2 <= 0);
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        System.out.println("Add Element to Array : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter Element is " + i + " of array 1 : ");
            array1[i] = scanner.nextInt();
        }
        System.out.println("\n");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter Element is " + i + " of array 2 : ");
            array2[i] = scanner.nextInt();
        }
        int size3 = size1 + size2;
        int[] array3 = new int[size3];
        for (int i = 0; i < array3.length; i++) {
            if (i < size1) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - size1];
            }
        }
        System.out.println("Array 3 : ");
        for (int i = 0; i < size3; i++) {
            System.out.print(array3[i] + "\t");
        }
    }
}
