import java.util.Scanner;

public class DuongCheo {
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
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < array.length; i++) {
                sum1 += array[i][i];
                sum2 += array[i][array.length-i-1];

        }
        System.out.println("tong 2 cheo chinh la : " + sum1 + " " + sum2 );

    }
}
