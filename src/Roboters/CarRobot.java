package Roboters;

import java.lang.Math;

public class CarRobot extends Robot{

    double calculateSeconds(int x, int y){
        double ans;
        ans = Math.sqrt((x*x) + (y*y));
        return ans;
    }

    public CarRobot(char direction, int xLocation, int yLocation) {
        super("Car", direction, xLocation, yLocation);
    }
}
