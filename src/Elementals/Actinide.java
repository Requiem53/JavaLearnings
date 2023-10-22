package Elementals;

public abstract class Actinide extends Element{
    public Actinide(String name, int atomicNum, String symbol, double weight, double meltingPoint, double boilingPoint) {
        super(name, atomicNum, symbol, weight, meltingPoint, boilingPoint);
    }

    public static class Uranium extends Actinide implements Radioactive{
        public Uranium(){
            super("Uranium",92,"U",238,1132.2,4131);
        }

        @Override
        public int half_life() {
            return 25166;
        }
    }
}
