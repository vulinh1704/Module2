package bai_tap_acess_modifier;

public class Circle {
    private static double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        Circle.radius = radius;
    }

     static double getRadius() {
        return radius;
    }

     static double getArea() {
        return Math.PI * getRadius() * getRadius();
    }
}
