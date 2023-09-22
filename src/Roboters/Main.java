package Roboters;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Hey there, start typing your Java code here...
        Robot someRobot;

        int type;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Robot type (1 - Vacuum, 2 - Car): ");
        type = sc.nextInt();

        int x,y;

        System.out.print("Enter position x: ");
        x = sc.nextInt();
        System.out.print("Enter position y: ");
        y = sc.nextInt();

        char direction;
        System.out.print("Enter initial direction (N, E, W, S): ");
        direction = sc.next().charAt(0);

        if(type == 1){
            someRobot = new VacuumRobot(direction, x, y);
        }else{
            someRobot = new CarRobot(direction, x, y);
        }


        Tester.test(someRobot);
    }

}
