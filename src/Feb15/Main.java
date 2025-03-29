package Feb15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape shape = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shape: ");
        String option = sc.nextLine();
        double side, a, b, radius, c, base, height;
        String color;
        switch (option) {
            case "Rectangle":
                System.out.print("Enter length: ");
                double len = sc.nextDouble();
                System.out.print("Enter width: ");
                double wid = sc.nextDouble();
                // This nextLine is to rid the next line made by the previous scan
                // Do this in the future as well, before getting a String input
                sc.nextLine();
                System.out.print("Enter color: ");
                color = sc.nextLine();
                shape = new Rectangle(len, wid, color);
                break;
            case "Ellipse":
                System.out.print("Enter a: ");
                a = sc.nextDouble();
                System.out.print("Enter b: ");
                b = sc.nextDouble();
                // This nextLine is to rid the next line made by the previous scan
                // Do this in the future as well, before getting a String input
                sc.nextLine();
                System.out.print("Enter color: ");
                color = sc.nextLine();
                shape = new Ellipse(color, a, b);
                break;
            case "Square":
                System.out.print("Enter side: ");
                side = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter color: ");
                color = sc.nextLine();
                shape = new Rectangle.Square(side, color);
                break;
            case "Equilateral Triangle":
                System.out.print("Enter side: ");
                side = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter color: ");
                color = sc.nextLine();
                shape = new Triangle.EquilateralTriangle(color, side);
                break;
            case "Triangle":
                System.out.print("Enter base: ");
                base = sc.nextDouble();
                System.out.print("Enter height: ");
                height = sc.nextDouble();
                System.out.print("Enter a: ");
                a = sc.nextDouble();
                System.out.print("Enter c: ");
                c = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter color: ");
                color = sc.nextLine();
                shape = new Triangle(color, base, height, a, c);
                break;
            case "Circle":
                System.out.print("Enter radius: ");
                radius = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter color: ");
                color = sc.nextLine();
                shape = new Ellipse.Circle( color, radius);
                break;
            // Add other cases for other shapes here

        }

        // This assert simply states that by the time the switch is done,
        // the shape should already be assigned to a particular shape
        // and is therefore not null anymore
        assert shape != null;
        System.out.println("\n" + shape);
        System.out.print("Area is ");
        System.out.format("%.2f", shape.area());
        System.out.print("\nPerimeter is ");
        System.out.format("%.2f", shape.perimeter());
    }
}