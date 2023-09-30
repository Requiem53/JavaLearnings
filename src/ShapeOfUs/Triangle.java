package ShapeOfUs;

public class Triangle extends Shape {
    private double a,c;
    private double base, height;

    public Triangle(double base,double height,double a,double c,String color){
        super(color);
        this.base = base;
        this.height = height;
        this.a = a;
        this.c = c;
    }

    public String toString() {
        return super.toString() + " which is also a Triangle";
    }

    public double area(){
        return 0.5*base*height;
    }
    public double perimeter(){
        return a+base+c;
    }

    public static class EquilateralTriangle extends Triangle {
        // TODO implement EquilateralTriangle
        public EquilateralTriangle(double side, String color){
            super(side,(Math.sqrt(3)/2) * side,side,side,color);
        }
        public String toString(){
            return super.toString() + " which is also an Equilateral Triangle";
        }
    }
}
