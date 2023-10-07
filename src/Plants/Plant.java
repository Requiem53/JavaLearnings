package Plants;

import java.util.Comparator;

public abstract class Plant implements Comparable<Plant> {
    public static final int INFINITE = Integer.MAX_VALUE;



    String name;
    int hp;
    int sun_cost;

    public Plant(String name, int sun_cost) {
        this.name = name;
        this.hp = 6;
        this.sun_cost = sun_cost;
    }

    public Plant(String name, int hp, int sun_cost) {
        this.name = name;
        this.hp = hp;
        this.sun_cost = sun_cost;
    }

    public boolean isAlive() {
        // TODO implementation
        if(hp > 0){
            return true;
        }
        return false;
    }

    public String die() {
        // TODO implementation
        hp = 0;
        return name + " dies";
    }

    @Override
    public String toString() {
        // TODO implementation
        if(!(hp == INFINITE)){
            return name + " (" + hp + ")" + " - cost: " + sun_cost;
        }else{
            return name + " (∞)" + " - cost: " + sun_cost;
        }
    }

    //Comparators
    public static class PlantHpComparator implements Comparator<Plant> {
        @Override
        public int compare(Plant o1, Plant o2) {
            if(o1.hp == o2.hp){
                return o1.compareTo(o2);
            }
            return Integer.compare(o2.hp, o1.hp);
        }
    }

    public int compareTo(Plant other){
        return this.name.compareTo(other.name);
    }

    public static class PlantSunCostComparator implements Comparator<Plant>{
        @Override
        public int compare(Plant o1, Plant o2) {
            if(o1.sun_cost == o2.sun_cost){
                return o1.compareTo(o2);
            }
            return Integer.compare(o2.sun_cost, o1.sun_cost);
        }
    }

    // Add Plant subclasses here, and
    // Hint: You can also add Comparator inner classes here
    // WallNut and CoffeeBean given for free
    public static class WallNut extends Plant{
        public WallNut() {
            super("Wall Nut", 25, 50);
        }
    }

    public static class CoffeeBean extends Plant{
        public CoffeeBean() {
            super("Coffee Bean", INFINITE, 75);
        }
    }

    public static class Squash extends Plant implements InstantKiller, Attacker{
        public Squash() {
            super("Squash", 50);
            setHpToInfinite();
        }

        @Override
        public int killType() {
            return 2;
        }

        @Override
        public int attack() {
            System.out.println(name + " attacks");
            System.out.println(die());
            return 3;
        }

        @Override
        public int rangeType() {
            //how to squash zombie
            return 3;
        }

        @Override
        public void setHpToInfinite() {
            hp = INFINITE;
        }

        public String die() {
            hp = 0;
            return name + " dies while squashing zombies";
        }

    }

    public static class Sunflower extends Plant implements SunProducer, Upgradable{
        public Sunflower() {
            super("Sunflower", 50);
        }

        @Override
        public int produce_sun() {
            System.out.println(name + " produces 25 suns");
            return 25;
        }

        @Override
        public PlantUpgrade upgrade() {
            return new TwinSunflower();
        }
    }

    public static class TwinSunflower extends Plant implements SunProducer, PlantUpgrade{

        public TwinSunflower() {
            super("Twin Sunflower", 250);
        }

        @Override
        public int produce_sun() {
            System.out.println(name + " produces 50 suns");
            return 50;
        }

        @Override
        public int concurrentSunCost() {
            return 50;
        }
    }


    public static class Jalapeno extends Plant implements InstantKiller, Attacker{
        public Jalapeno() {
            super("Jalapeno", 125);
            setHpToInfinite();
        }

        @Override
        public int killType() {
            return 1;
        }

        @Override
        public void setHpToInfinite() {
            hp = INFINITE;
        }

        @Override
        public int attack() {
            System.out.println(name + " attacks");
            System.out.println(die());
            return 5;
        }

        @Override
        public int rangeType() {
            return 1;
        }

        public String die() {
            hp = 0;
            return name + " dies while exploding";
        }
    }

    public static class Cattail extends Plant implements PlantUpgrade, Attacker {
        public Cattail() {
            super("Cattail", 225);
        }

        @Override
        public int attack() {
            System.out.println(super.name + " attacks");

            return 1;
        }

        @Override
        public int rangeType() {
            return 4;
        }

        @Override
        public int concurrentSunCost() {
            return 25;
        }
    }
    public static class LilyPad extends Plant implements Upgradable{
        public LilyPad(){
            super("Lily Pad", 25);
        }

        @Override
        public PlantUpgrade upgrade() {
            return new Cattail();
        }
    }


    public static class Peashooter extends Plant implements Attacker{
        public Peashooter() {
            super("Peashooter", 100);
        }

        @Override
        public int attack() {
            System.out.println(super.name + " attacks");
            return 1;
        }

        @Override
        public int rangeType() {
            return 1;
        }
    }

}
