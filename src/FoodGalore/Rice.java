package FoodGalore;

public class Rice implements FoodInterface{

    public int satietyPoints;

    public Rice(){
        this.satietyPoints = 20;
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