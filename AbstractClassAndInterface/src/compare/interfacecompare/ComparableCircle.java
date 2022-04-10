package compare.interfacecompare;

import compare.circle.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(){

    }
    public ComparableCircle(double radius){
        super(radius);
    }
    public ComparableCircle(double radius , String color , boolean filed){
        super(radius,color,filed);
    }
    @Override
    public int compareTo(ComparableCircle c1) {
        if (getRadius() > c1.getRadius()) return 1;
        else if (getRadius() < c1.getRadius()) return -1;
        else return 1;

    }
}
