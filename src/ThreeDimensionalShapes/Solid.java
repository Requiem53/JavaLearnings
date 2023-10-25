package ThreeDimensionalShapes;

import java.lang.Math;

public abstract class Solid {
    public int x,y;

    public Solid(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Solid() {
        x = 50;
        y = 50;
    }

    public String toString(){
        return "A solid at (" + x + ", " + y + ")";
    }

    public abstract double volume();
    public abstract double surfaceArea();
}
