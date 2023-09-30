package FoodGalore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Hey there, start typing your Java code here
        Scanner sc = new Scanner(System.in);

        Human human = new Human();

        int num;
        System.out.print("Enter the number of times to cook Egg: ");
        num = sc.nextInt();
        Egg egg = new Egg();
        egg.cook(num);
        human.feed(egg);

        System.out.print("Enter the number of times to cook Bread: ");
        num = sc.nextInt();
        Bread bread = new Bread();
        bread.cook(num);
        human.feed(bread);

        System.out.print("Enter the number of times to cook Rice: ");
        num = sc.nextInt();
        Rice rice = new Rice();
        rice.cook(num);
        human.feed(rice);

        System.out.print("Enter the number of times to cook Meat: ");
        num = sc.nextInt();
        Meat meat = new Meat();
        meat.cook(num);
        human.feed(meat);


        Tester.test(human, egg, bread, rice, meat);
    }
}
