package bai_tap_acess_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        System.out.println("Radius = " + Circle.getRadius() + " and Area = " + Circle.getArea());
    }
}
