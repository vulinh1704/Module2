package compare.test;

import compare.interfacecompare.ComparableCircle;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
//        Circle[] circles = new Circle[3];
//        circles[0] = new Circle(3.6);
//        circles[1] = new Circle();
//        circles[2] = new Circle(6.7, "red", true);

//        System.out.println("before sorting : ");
//        for (Circle circle : circles) {
//            System.out.println(circle);
//        }
//        System.out.println("after comparison : ");
//        Comparator<Circle> circleComparator = new CircleComparator();
//        Arrays.sort(circles, circleComparator);
//        for (Circle circle : circles) {
//            System.out.println(circle);
//        }

        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
