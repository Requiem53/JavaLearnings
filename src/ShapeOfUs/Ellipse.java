package ShapeOfUs;

import java.lang.Math;

public class Ellipse extends Shape {
    private double semimajor,semiminor;

    public Ellipse(double semimajor, double semiminor, String color){
        super(color);
        this.semimajor = semimajor;
        this.semiminor = semiminor;
    }

    @Override
    public String toString() {
        return super.toString() + " which is also an Ellipse";
    }

    public double area(){
        return Math.PI * semimajor * semiminor;
    }
    public double perimeter(){
        return Math.PI * (3*(semimajor+semiminor) - Math.sqrt( (semimajor + (3*semiminor)) * (semiminor + (3*semimajor)) ) );
    }


    public static class Circle extends Ellipse {
        // TODO implement Circle
        public Circle(double radius, String color) {
            super(radius,radius,color);
        }
        @Override
        public String toString() {
            return super.toString() + " which is also a Circle";
        }
    }
}
