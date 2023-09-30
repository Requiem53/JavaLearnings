package ShapeOfUs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape shape = null;
        Scanner sc = new Scanner(System.in);
        String option;
        List<Shape> shapes = new ArrayList<>();
        do {
            System.out.print("Enter shape: ");
            option = sc.nextLine();
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
                    String color = sc.nextLine();
                    shape = new Rectangle(len, wid, color);
                    shapes.add(shape);
                    break;
                case "Square":
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    shape = new Rectangle.Square(side,color);
                    shapes.add(shape);
                    break;
                // Add other cases for other shapes here
                case "Ellipse":
                    System.out.print("Enter a: ");
                    double semimajor,semiminor;
                    semimajor = sc.nextDouble();
                    System.out.print("Enter b: ");
                    semiminor = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    shape = new Ellipse(semimajor,semiminor,color);
                    shapes.add(shape);
                    break;
                case "Circle":
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    shape = new Ellipse.Circle(radius,color);
                    shapes.add(shape);
                    break;
                case "Triangle":
                    System.out.print("Enter base: ");
                    double base,height;
                    base = sc.nextDouble();
                    System.out.print("Enter height: ");
                    height = sc.nextDouble();
                    System.out.print("Enter a: ");
                    double a,c;
                    a = sc.nextDouble();
                    System.out.print("Enter c: ");
                    c = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    shape = new Triangle(base,height,a,c,color);
                    shapes.add(shape);
                    break;
                case "Equilateral Triangle":
                    System.out.print("Enter side: ");
                    double side1 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    shape = new Triangle.EquilateralTriangle(side1,color);
                    shapes.add(shape);
                    break;

            }
        } while (!option.equals("DONE"));

        do {
            System.out.print("Sort by: ");
            option = sc.nextLine();
            switch (option) {
                case "DONE":
                    break;
                case "Color":
                    // TODO sort by color
                    Collections.sort(shapes, new Shape.ShapeColorComparator());
                    for (Shape s : shapes) {
                        System.out.print("Area of " + s + ": ");
                        System.out.format("%.2f\n", s.area());
                    }
                    break;
                case "Area":
                    // TODO sort by area
                    Collections.sort(shapes);
                    for (Shape s : shapes) {
                        System.out.print("Area of " + s + ": ");
                        System.out.format("%.2f\n", s.area());
                    }
                    break;
                case "Perimeter":
                    // TODO sort by perimeter
                    Collections.sort(shapes, new Shape.ShapePerimeterComparator());
                    for (Shape s : shapes) {
                        System.out.print("Perimeter of " + s + ": ");
                        System.out.format("%.2f\n", s.perimeter());
                    }
                    break;
            }
        } while (!option.equals("DONE"));
    }
}
