package PointTarget;

import java.util.Comparator;
import java.lang.Math;

public class Point implements Comparable<Point>{
    public int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    public int compareTo(Point other){
        int res = Integer.compare(other.y, y);
        if(res == 0){
            return new PointXComparator().compare(this, other);
        }
        return res;
    }
    public static class PointDistanceComparator implements Comparator<Point>{

        Point target;
        public PointDistanceComparator(Point target){
            this.target = target;
        }
        public int compare(Point o1, Point o2){
            return Double.compare(distanceTarget(o1), distanceTarget(o2));
        }

        public double distanceTarget(Point point){
            return Math.sqrt(Math.pow((target.x - point.x),2) + Math.pow((target.y - point.y),2));
        }
    }

    public static class PointXComparator implements Comparator<Point>{
        public int compare(Point o1, Point o2){
            return Integer.compare(o1.x, o2.x);
        }
    }
}
