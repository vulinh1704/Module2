package resizeable.run;

import resizeable.figure.Circle;
import resizeable.figure.Rectangle;
import resizeable.figure.Shape;
import resizeable.figure.Square;
import resizeable.interfaceresizeable.Colorable;

public class Run {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(x, "Black", false);
        shapes[1] = new Rectangle(x, x, "Yellow", true);
        shapes[2] = new Circle(x, "Pink", true);

        System.out.println("Before size increase : ");
        for (Shape a : shapes) {
            System.out.println(a);
        }
        for (Shape a : shapes) {
            a.resize(Math.random() * 1000);
        }
        System.out.println("After size increase : ");
        for (Shape a : shapes) {
            System.out.println(a);
            if (a instanceof Colorable) {
//                ((Colorable) a).howToColor();
                a = new Square();
                ((Square) a).howToColor();
            }

         }

    }
}

