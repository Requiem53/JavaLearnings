package FruitBasket;

public class Banana extends Fruit{
    @Override
    public void getTaste() {
        System.out.println("Banana tastes: Sweet and creamy");
    }

    @Override
    public void getTexture() {
        System.out.println("Banana feels: Soft and smooth");
    }
}
