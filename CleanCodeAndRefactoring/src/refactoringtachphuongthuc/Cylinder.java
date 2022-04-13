package refactoringtachphuongthuc;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = 2 * Math.PI  * radius;
        double volume = getVolume(height, baseArea, perimeter);
        return volume;

    }

    private static double getVolume(int height, double baseArea, double perimeter) {
        return perimeter * height + 2 * baseArea;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
}
