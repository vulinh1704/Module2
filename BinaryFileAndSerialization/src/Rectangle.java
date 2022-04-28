public class Rectangle {
    public int minX;
    public int minY;
    public int maxX;
    public int maxY;

    public Rectangle(int X1, int Y1, int X2, int Y2) {
        minX = Math.min(X1, X2);
        minY = Math.min(Y1, Y2);
        maxX = Math.max(X1, X2);
        maxY = Math.max(Y1, Y2);
    }
    public int getArea(){
        return (this.maxX - this.minX)*(this.maxY - this.minY);
    }
}
class Main {
    public static Rectangle RectFinder(Rectangle A, Rectangle B){
        if(A.minX > B.maxX)
            return null;
        if(B.minX > B.maxX)
            return null;
        if(A.minY > B.maxY)
            return null;
        if(B.minY > A.maxY)
            return null;
        return new Rectangle(Math.min(A.maxX, B.maxX), Math.min(A.minX, B.minX), Math.min(A.maxY, B.maxY), Math.min(A.minY, B.minY));
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(0 , 0 ,4,3);
        Rectangle rectangle1 = new Rectangle(-2 , 2,2 ,6);
        Rectangle rectFinder = Main.RectFinder(rectangle , rectangle1);
        System.out.println(rectFinder.getArea());
    }
}
