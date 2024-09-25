abstract class Shape {
    abstract void RectangleArea(float l, float b);
    abstract void SquareArea(float s);
    abstract void CircleArea(float r);
}

class Area extends Shape {
    void RectangleArea(float l, float b) {
        System.out.println("Area of Rectangle: " + (l * b) + " sq. unit");
    }
    void SquareArea(float s) {
        System.out.println("Area of Square: " + (s * s) + " sq. unit");
    }
    void CircleArea(float r) {
        System.out.println("Area of Circle: " + (3.14 * r * r) + " sq. unit");
    }
}

public class p2 {
    public static void main(String args[]) {
        Area a1 = new Area();
        a1.RectangleArea(25f, 3.5f);
        System.out.println();
        a1.SquareArea(7.2f);
        System.out.println();
        a1.CircleArea(5.5f);
    }
}
