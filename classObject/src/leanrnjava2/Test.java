package leanrnjava2;

public class Test {
    public static void main(String[] args) {
        float sum = 0;
        try {
            sum = Calculator.divide(5, 0);
            System.out.println("Sum = " + sum);
        } catch (DevideByZeroException e) {
            System.out.println(e.getMessage());;
        }

    }
}
