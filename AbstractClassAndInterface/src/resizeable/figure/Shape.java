package resizeable.figure;

import resizeable.interfaceresizeable.Resizeable;

public class Shape implements Resizeable {
    private String color = "red";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }

    public static void printShape(Shape[] shapes) {
        for (Shape x : shapes) {
            System.out.println(x.toString());
        }
    }

    @Override
    public void resize(double percent) {
    }
}
