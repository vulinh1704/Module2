package systemofgeometricobjects;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea() {
        return Math.sqrt((getPerimeter() / 2) * (getPerimeter() / 2 - this.side1) * (getPerimeter() / 2 - this.side2)
                * (getPerimeter() / 2 - this.side3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", Perimeter=" + getPerimeter() +
                ", Area=" + getArea() +
                '}';
    }
}
