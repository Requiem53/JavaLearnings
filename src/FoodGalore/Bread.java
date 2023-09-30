package FoodGalore;

public class Bread implements FoodInterface{

    public int satietyPoints;

    public Bread(){
        this.satietyPoints = 10;
    }

    @Override
    public void cook(int n) {
        satietyPoints *= n;
    }

    @Override
    public int eat() {
        return satietyPoints;
    }
}
