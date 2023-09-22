package Roboters;

public class Robot {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public int getXLocation() {
        return xLocation;
    }

    public void setXLocation(int xLocation) {
        this.xLocation = xLocation;
    }

    public int getYLocation() {
        return yLocation;
    }

    public void setYLocation(int yLocation) {
        this.yLocation = yLocation;
    }

    private char direction;
    private int xLocation;
    private int yLocation;

    public Robot(String name, char direction, int xLocation, int yLocation) {
        this.name = name;
        this.direction = direction;
        this.xLocation = xLocation;
        this.yLocation = yLocation;
    }

    public void turnClockwise(){
        if(direction == 'N'){
            direction = 'E';
        }else if(direction == 'W'){
            direction = 'N';
        }else if(direction == 'E'){
            direction = 'S';
        }else if(direction == 'S'){
            direction = 'W';
        }
    }

    public void turnCounterclockwise(){
        if(direction == 'N'){
            direction = 'W';
        }else if(direction == 'W'){
            direction = 'S';
        }else if(direction == 'E'){
            direction = 'N';
        }else if(direction == 'S'){
            direction = 'E';
        }
    }

    public void move(int steps){
        if(direction == 'N'){
            yLocation+=steps;
        }else if(direction == 'W'){
            xLocation-=steps;
        }else if(direction == 'E'){
            xLocation+=steps;
        }else if(direction == 'S'){
            yLocation-=steps;
        }
    }

    public String toString(){
        return name + " faces " + direction + " and is located at coordinates (" + xLocation + ", " + yLocation + "). ";
    }
}
