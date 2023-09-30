package ShapeOfUs;

import java.util.Comparator;

public abstract class Shape implements Comparable<Shape>{
    String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A shape that is color " + color;
    }

    public abstract double area();
    public abstract double perimeter();

    public int compareTo(Shape other){
        return Double.compare(other.area(),this.area() );
    }

    public static class ShapeColorComparator implements Comparator<Shape>{
        public int compare(Shape s1, Shape s2){
            int result = s1.color.compareTo(s2.color);
            if(result == 0){
                result = s1.compareTo(s2);
            }
            return result;
        }
    }

    public static class ShapePerimeterComparator implements Comparator<Shape>{
        public int compare(Shape s1, Shape s2){
            return Double.compare(s2.perimeter(), s1.perimeter());
        }
    }
}
