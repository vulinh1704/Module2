package staticmember;

import java.util.ArrayList;

public class Boxing {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(-20);
        numbers.add(Integer.valueOf(120));

        Integer a = numbers.get(0);
    }
}
