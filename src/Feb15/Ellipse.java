package Feb15;

public class Ellipse extends Shape{
    private double a, b;

    public Ellipse(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return Math.PI * a * b;
    }

    @Override
    public double perimeter() {
        return Math.PI * ( 3 * (a+b) - Math.sqrt( (a + 3*b) * (b + 3*a) ) );
    }

    @Override
    public String toString() {
        return super.toString() + " that is also a Circle";
    }

    public static class Circle extends Ellipse {

        public Circle(String color, double radius) {
            super(color, radius, radius);
        }

        @Override
        public String toString() {
            return super.toString() + " that is also a Circle";
        }
    }
}
