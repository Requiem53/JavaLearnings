package FoodGalore;

public class Meat implements FoodInterface{

    public int satietyPoints;

    public Meat(){
        this.satietyPoints = 40;
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
