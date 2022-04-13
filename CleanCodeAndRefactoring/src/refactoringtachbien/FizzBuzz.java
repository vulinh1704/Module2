package refactoringtachbien;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isBuzz = number % 5 == 0;
        boolean isFizz = number % 3 == 0;
        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }
}
