package Roboters;

import java.util.ArrayList;

public class VacuumRobot extends  Robot{
    private int totalUnitsCleaned;

    public int getTotalUnitsCleaned() {
        return totalUnitsCleaned;
    }

    public String toString(){
        return super.toString() + "It has cleaned " + totalUnitsCleaned + " units so far";
    }

    public VacuumRobot(char direction, int xLocation, int yLocation) {
        super("Vacuum", direction, xLocation, yLocation);
    }

    ArrayList<Integer> xVisited = new ArrayList<>();
    ArrayList<Integer> yVisited = new ArrayList<>();

    boolean xUnique;
    boolean yUnique;


    public void move(int steps){
        if(getDirection() == 'N'){
            setYLocation(getYLocation()+steps);
            unique();
        }else if(getDirection() == 'W'){
            setXLocation(getXLocation()-steps);
            unique();
        }else if(getDirection() == 'E'){
            setXLocation(getXLocation()+steps);
            unique();
        }else if(getDirection() == 'S'){
            setYLocation(getYLocation()-steps);
            unique();
        }

    }

    void unique(){
        for(int x: xVisited){
            if(getXLocation() != x){
                xUnique = true;
            }else {
                xUnique = false;
                break;
            }
        }

        for(int y: yVisited){
            if(getYLocation() != y){
                yUnique = true;
            }else {
                yUnique = false;
                break;
            }
        }

        if(xUnique){
            xVisited.add(getXLocation());
        }
        if(yUnique){
            yVisited.add(getYLocation());
        }

        if(xUnique || yUnique){
            totalUnitsCleaned++;
        }

        xUnique = false;
        yUnique = false;
    }

}