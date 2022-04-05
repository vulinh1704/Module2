import java.util.Scanner;

public class SumCol {
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
                System.out.print("Enter Element Row " + i + " Col " + j + "\t");
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
        System.out.print("Nhap cot muon cong : ");
        int c = scanner.nextInt();
        double Sum = sum(c,array);
        System.out.print("Col : " + c + " Sum " + Sum);

    }

    public static double sum(int c, double[][] arr){
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i][c - 1];
        }

        return s;
    }
}
