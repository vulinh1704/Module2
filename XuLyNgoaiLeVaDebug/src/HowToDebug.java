public class HowToDebug {
    public static void F(int a) {
        a++;
        System.out.println("Check a: " + a);
    }

    public static void main(String[] args) {
        int a = 0;
        a++;
        int b = 0;
        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i < 10; i++) {
            a++;
            System.out.println("a = " + a);
            F(a);
        }
        System.out.println("Done!");
    }
}
