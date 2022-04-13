package demo.Test;

import demo.AppCalculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add1And1() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 1);
        assertEquals(2, result);
    }

    @Test
    void addMaxValueAnd1() {
        Calculator calculator = new Calculator();
        assertThrows(RuntimeException.class, () -> {
            int result = calculator.add(Integer.MAX_VALUE, 1);
        });
    }

    @Test
    void addMinValueNegativeAnd1() {
        Calculator calculator = new Calculator();
        assertThrows(RuntimeException.class, () -> {
            int result = calculator.add(Integer.MIN_VALUE, -1);
        });
    }

}