package demo.AppCalculator;

public class Calculator {
    public int add(int first, int second) {

        if (first / 2 + second / 2 >= Integer.MAX_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }

        if (first / 2 + second / 2 <= Integer.MIN_VALUE / 2) {
            throw new RuntimeException("Out of range");
        }
        return first + second;
    }
}
