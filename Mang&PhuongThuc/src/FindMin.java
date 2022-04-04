public class FindMin {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 8, -1};
        System.out.println("The smallest element in array is : " + minValue(array));
    }

    public static int minValue(int[] Array) {
        int min = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] < min) {
                min = Array[i];
            }
        }
        return min;
    }

}
