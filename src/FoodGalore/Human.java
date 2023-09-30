package FoodGalore;

import java.lang.Math;

public class Human {

    public int satietyLevel = 0;

    public void getSatiety(){
        satietyLevel = Math.min(100, satietyLevel);
        if(satietyLevel < 50){
            System.out.println("Hungry");
        }else if(satietyLevel < 90){
            System.out.println("Satiated");
        }else{
            System.out.println("Full");
        }
    }

    public void feed(FoodInterface food){
        satietyLevel += food.eat();
        satietyLevel = Math.min(100, satietyLevel);
    }
}
