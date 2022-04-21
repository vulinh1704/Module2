package leanrnjava2;

public class Calculator {
    public static float divide (int x , int y) throws DevideByZeroException{
        if (y == 0){
            throw new DevideByZeroException(x , y);
        }
        return  x/y;
    }
    public static float plus(float x , float y){
        return x+y;
    }
}
