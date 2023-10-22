package Elementals;

public abstract class PostTransitionMetal extends Element{
    public PostTransitionMetal(String name, int atomicNum, String symbol, double weight, double meltingPoint, double boilingPoint) {
        super(name, atomicNum, symbol, weight, meltingPoint, boilingPoint);
    }

    public static class Tin extends PostTransitionMetal{
        public Tin() {
            super("Tin", 50, "Sn", 118.7, 231.9, 2602);
        }
    }

    public static class Aluminum extends PostTransitionMetal implements Conductive{
        public Aluminum() {
            super("Aluminum", 13, "Al", 27, 660.3, 2470);
        }

        @Override
        public float percent_conductive() {
            return 0.61f;
        }
    }
}
