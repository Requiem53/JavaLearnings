package Elementals;

public abstract class TransitionMetal extends Element{
    public TransitionMetal(String name, int atomicNum, String symbol, double weight, double meltingPoint, double boilingPoint) {
        super(name, atomicNum, symbol, weight, meltingPoint, boilingPoint);
    }

    public static class Titanium extends TransitionMetal{
        public Titanium() {
            super("Titanium", 22, "Ti", 47.9, 1668, 3287);
        }
    }


    public static class Gold extends TransitionMetal implements Conductive{
        public Gold() {
            super("Gold", 79, "Au", 197, 1064, 2970);
        }

        @Override
        public float percent_conductive() {
            return 0.7f;
        }
    }

    public static class Zinc extends TransitionMetal implements Conductive{
        public Zinc() {
            super("Zinc", 30, "Zn", 65.4, 419.5, 907.0);
        }

        @Override
        public float percent_conductive() {
            return 0.27f;
        }
    }

    public static class Iron extends TransitionMetal implements Magnetic{
        public Iron() {
            super("Iron", 26, "Fe", 55.8, 1538, 2862);
        }

        @Override
        public int magnetic_strength() {
            return 1710;
        }

        @Override
        public int magnetic_type() {
            return 0;
        }
    }

    public static class Copper extends TransitionMetal implements Conductive{
        public Copper() {
            super("Copper", 29, "Cu", 63.5, 1085, 2562);
        }

        @Override
        public float percent_conductive() {
            return 1.0f;
        }
    }

    public static class Technetium extends TransitionMetal implements Conductive, Magnetic, Radioactive{
        public Technetium() {
            super("Technetium", 43, "Tc", 98, 2157, 4265);
        }

        @Override
        public float percent_conductive() {
            return 0.65f;
        }

        @Override
        public int magnetic_strength() {
            return 270;
        }

        @Override
        public int magnetic_type() {
            return 1;
        }

        @Override
        public int half_life() {
            return 61;
        }
    }
}
