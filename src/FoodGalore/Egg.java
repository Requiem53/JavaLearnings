package FoodGalore;

public class Egg implements FoodInterface {

    public int satietyPoints;

    public Egg(){
        this.satietyPoints = 5;
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
