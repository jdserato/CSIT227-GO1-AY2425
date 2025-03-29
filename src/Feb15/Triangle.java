package Feb15;

public class Triangle extends Shape{
    double base, height, a, c;
    public Triangle(String color, double base, double height, double a, double c) {
        super(color);
        this.a = a;
        this.base = base;
        this.height = height;
        this.c = c;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return a + base + c;
    }

    @Override
    public String toString() {
        return super.toString() + " that is also a Triangle";
    }

    public static class EquilateralTriangle extends Triangle {

        public EquilateralTriangle(String color, double side) {
            super(color, side, Math.sqrt(3)/2 * side, side, side);
        }

        @Override
        public String toString() {
            return super.toString() + " that is also an Equilateral Triangle";
        }
    }
}
