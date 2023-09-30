package FruitBasket;

public class Apple extends Fruit{

    @Override
    public void getTaste() {
        System.out.println("Apple tastes: Sweet and slightly tart");
    }

    @Override
    public void getTexture() {
        System.out.println("Apple feels: Crisp");
    }
}
