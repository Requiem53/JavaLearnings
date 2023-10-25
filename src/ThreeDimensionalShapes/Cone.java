package ThreeDimensionalShapes;

public class Cone extends Solid{

    double base, height, slant, radius;

    public Cone(int x, int y, double base, double height) {
        super(x, y);
        this.base = base;
        this.height = height;
        radius = base / 2;
        slant = Math.sqrt(Math.pow(radius,2) + Math.pow(height,2));
    }

    public Cone(double base, double height) {
        super();
        this.base = base;
        this.height = height;
        radius = base / 2;
        slant = Math.sqrt(Math.pow(radius,2) + Math.pow(height,2));
    }

    @Override
    public double volume() {
        return (1/3.0 * Math.PI * Math.pow(radius, 2) * height);
    }

    @Override
    public double surfaceArea() {
        return (Math.PI * (radius * (slant + radius)));
    }

    public String toString(){
        return super.toString() + " which is a Cone";
    }
}
