package LetsMakeARobot;

import java.util.ArrayList;

public class VacuumRobot extends  Robot{
    private int totalUnitsCleaned;

    public int getTotalUnitsCleaned() {
        return totalUnitsCleaned;
    }

    public String toString(){
        return super.toString() + "It has cleaned " + totalUnitsCleaned + " units so far.";
    }

    public VacuumRobot(char direction, int xLocation, int yLocation) {
        super("Vacuum", direction, xLocation, yLocation);
    }


    public void move(int steps){
        if(getDirection() == 'N'){
            for(int i = 0; i < steps; i++){
                setYLocation(getYLocation()+1);
                unique();
            }
        }else if(getDirection() == 'W'){
            for(int i = 0; i < steps; i++){
                setXLocation(getXLocation()-1);
                unique();
            }
        }else if(getDirection() == 'E'){
            for(int i = 0; i < steps; i++){
                setXLocation(getXLocation()+1);
                unique();
            }
        }else if(getDirection() == 'S'){
            for(int i = 0; i < steps; i++){
                setYLocation(getYLocation()-1);
                unique();
            }
        }

    }


    ArrayList<Point> visited = new ArrayList<>();
    boolean unique = true;

    Point point;

    void unique() {

        point = new Point(getXLocation(), getYLocation());

        for(Point area : visited){
            if(!(point.x == area.x && point.y == area.y)){
                unique = true;
            }else{
                unique = false;
                break;
            }
        }

        if(unique){
            visited.add(new Point(getXLocation(), getYLocation()));
            totalUnitsCleaned++;
        }

        unique = false;

    }

}