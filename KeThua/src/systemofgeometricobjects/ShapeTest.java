package systemofgeometricobjects;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("red" , false);
        System.out.println(shape1);

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(6.5);
        System.out.println(circle);
        circle = new Circle(3.4,"haha",false);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

    }
}
