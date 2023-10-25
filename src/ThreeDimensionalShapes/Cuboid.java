package ThreeDimensionalShapes;

public class Cuboid extends Solid{

    public Cuboid(int x, int y, double height, double base, double length) {
        super(x, y);
        this.height = height;
        this.base = base;
        this.length = length;
    }

    public Cuboid(double height, double base, double length) {
        super();
        this.height = height;
        this.base = base;
        this.length = length;
    }

    double height, base, length;

    @Override
    public double volume() {
        return base*length*height;
    }

    @Override
    public double surfaceArea() {
        return 2*((length*base) + (base*height) + (length*height));
    }

    public String toString(){
        return super.toString() + " which is a Cuboid";
    }

    public static class Cube extends Cuboid{

        public Cube(int x, int y, double side) {
            super(x, y, side,side,side);
        }

        public Cube(double side) {
            super(side, side, side);
        }

        public String toString(){
            return super.toString() + " which is also a Cube";
        }
    }
}
