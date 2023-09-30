package SimpleDrawingWithShapes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Hey there, start typing your Java code here...
        Shape someShape;

        System.out.print("Select shape: (1 - Triangle, 2 - Square, 3 - Diamond): ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int stats;
        if(num == 1){
            System.out.print("Enter height: ");
            stats = sc.nextInt();
            someShape = new Triangle(stats);
        }else if(num == 2){
            System.out.print("Enter side: ");
            stats = sc.nextInt();
            someShape = new Square(stats);
        }else {
            System.out.print("Enter height: ");
            stats = sc.nextInt();
            someShape = new Diamond(stats);
        }

        Tester.test(someShape);
    }
}
