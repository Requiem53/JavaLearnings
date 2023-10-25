package ThreeDimensionalShapes;

public class Sphere extends Solid{

    public Sphere(int x, int y, double diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    public Sphere(double diameter) {
        super();
        this.diameter = diameter;
    }

    double diameter;

    @Override
    public double volume() {
        return (4/3.0 * Math.PI * Math.pow(diameter/2.0,3));
    }

    @Override
    public double surfaceArea() {
        return (4 * Math.PI * Math.pow(diameter/2.0,2));
    }

    public String toString(){
        return super.toString() + " which is a Sphere";
    }

    public static class Hemisphere extends Sphere{
        public Hemisphere(int x, int y, double diameter) {
            super(x, y, diameter);
        }

        public Hemisphere(double diameter) {
            super(diameter);
        }

        public String toString(){
            return super.toString() + " but only half of it";
        }

        @Override
        public double volume() {
            return  (2/3.0 * Math.PI * Math.pow(diameter/2.0,3));
        }

        @Override
        public double surfaceArea() {
            return (3 * Math.PI * Math.pow(diameter/2.0,2));
        }
    }

}
