package Roboters;

import java.lang.Math;

public class CarRobot extends Robot{

    double calculateSeconds(int x, int y){
        double sum = 0;
        sum += Math.abs(x) + Math.abs(getXLocation());
        sum += Math.abs(y) + Math.abs(getYLocation());
        return sum;
    }

    public CarRobot(char direction, int xLocation, int yLocation) {
        super("Car", direction, xLocation, yLocation);
    }
}
