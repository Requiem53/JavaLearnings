package FruitBasket;

import java.util.ArrayList;

public class FruitBasket {
    private ArrayList<Fruit> fruits = new ArrayList<Fruit>();

    public void addFruit(Fruit fruit){
        fruits.add(fruit);
    }

    public void countApple(){
        int counter = 0;
        for(Fruit fruit: fruits){
            if(fruit instanceof Apple){
                counter++;
            }
        }

        System.out.println("Number of Apples in the basket: " + counter);
    }

    public void countOrange(){
        int counter = 0;
        for(Fruit fruit: fruits){
            if(fruit instanceof Orange){
                counter++;
            }
        }

        System.out.println("Number of Oranges in the basket: " + counter);
    }

    public void countBanana(){
        int counter = 0;
        for(Fruit fruit: fruits){
            if(fruit instanceof Banana){
                counter++;
            }
        }

        System.out.println("Number of Bananas in the basket: " + counter);

    }

    public void fruitBasketTastes(){
        for(Fruit fruit: fruits){
            fruit.getTaste();
        }
    }

    public void fruitBasketTextures(){
        for(Fruit fruit: fruits){
            fruit.getTexture();
        }
    }
}
