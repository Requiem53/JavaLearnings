package FruitBasket;

public class Orange extends Fruit{
    @Override
    public void getTaste() {
        System.out.println("Orange tastes: Tangy and sweet");
    }

    @Override
    public void getTexture() {
        System.out.println("Orange feels: Juicy");
    }
}
