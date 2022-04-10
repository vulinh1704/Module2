package compare.circle;

public class Circle {
    private double radius;
    private String color;
    private boolean filed;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filed) {
        this.radius = radius;
        this.color = color;
        this.filed = filed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiled() {
        return filed;
    }

    public void setFiled(boolean filed) {
        this.filed = filed;
    }

    @Override
    public String toString() {
        return "Circle{ " +
                "radius = " + radius +
                ", color = '" + color + '\'' +
                ", filed = " + filed +
                '}';
    }
}
