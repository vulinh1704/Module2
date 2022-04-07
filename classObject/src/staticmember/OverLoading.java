package staticmember;

public class OverLoading {
    public static int add (int a, int b){
        return a + b;
    }
    public static int add (int a , short b){
        return a + b;
    }
    public static float add(float a , float b){
        return a + b;
    }

    public static void main(String[] args) {
        add(100,200);
    }
}
