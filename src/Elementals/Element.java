package Elementals;

// Also put Actinide and Uranium as inner class here

public abstract class Element implements Comparable<Element>{
    private String name;
    private int atomicNum;
    private String symbol;
    private double atomicWeight;

    private double meltingPoint;
    private double boilingPoint;

    public int getAtomicNum() {
        return atomicNum;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public int state(float temperature){
        if(temperature < meltingPoint){
            return 0;
        }else if(temperature >= meltingPoint && temperature < boilingPoint){
            return 1;
        }else{
            return 2;
        }
    }

    public Element(String name, int atomicNum, String symbol, double weight, double meltingPoint, double boilingPoint) {
        this.name = name;
        this.atomicNum = atomicNum;
        this.symbol = symbol;
        this.atomicWeight = weight;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;
    }

    public String toString(){
        return atomicNum + " " + name + " (" + symbol +")";
    }

    public int compareTo(Element other){
        return Double.compare(this.atomicWeight, other.atomicWeight);
    }
}
