import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        int sizeRow;
        int sizeCol;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size Row : ");
            sizeRow = scanner.nextInt();
            System.out.print("Enter a size Col : ");
            sizeCol = scanner.nextInt();
        } while (sizeRow <= 0 || sizeCol <= 0);
        double[][] array = new double[sizeRow][sizeCol];
        System.out.println("Enter array!");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter Element Row " + i + " Col " + j);
                array[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Entered Array : ");
        for (double[] doubles : array) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + "\t");
            }
            System.out.println();
        }
        double max = array[0][0];
        for (double[] doubles : array) {
            for (double aDouble : doubles) {
                if (max < aDouble) {
                    max = aDouble;
                }
            }
        }
        System.out.println("Max Element Array : " + max);
        double min = array[0][0];
        for (double[] doubles : array) {
            for (double aDouble : doubles) {
                if (min > aDouble) {
                    min = aDouble;
                }
            }
        }
        System.out.println("Min Element Array : " + min);

    }
}
