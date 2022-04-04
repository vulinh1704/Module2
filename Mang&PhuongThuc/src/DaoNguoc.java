import java.util.Scanner;

public class DaoNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter a size : ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size < 20 !");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
