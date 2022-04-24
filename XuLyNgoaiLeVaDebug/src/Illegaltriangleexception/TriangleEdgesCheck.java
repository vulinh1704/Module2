package Illegaltriangleexception;

public class TriangleEdgesCheck {
    public void checkTriangleEdges(double a, double b, double c) throws IllegalTriangleException {
        if(a + b <= c || a + c <= b || c + b <= a) {
            throw new IllegalTriangleException("Lỗi : Tam giác không hợp lệ ! ");
        } else {
            System.out.println("Tam giác hợp lệ !");
        }
    }
}
