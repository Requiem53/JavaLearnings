package Elementals;

import java.util.ArrayList;
import java.util.List;

public abstract class Alloy{
    String name;
    ArrayList<Element> elements = new ArrayList<>();

    public String toString(){
        return name;
    }

    public Alloy(String name, Element element1, Element element2) {
        this.name = name;
        elements.add(element1);
        elements.add(element2);
    }

    public static class Steel extends Alloy implements Magnetic{
        public Steel(){
            super("Steel", new TransitionMetal.Iron(),new TransitionMetal.Copper());
        }

        @Override
        public int magnetic_strength() {
            return 1950;
        }

        @Override
        public int magnetic_type() {
            return 0;
        }
    }

    public static class Bronze extends Alloy{
        public Bronze(){
            super("Bronze", new PostTransitionMetal.Tin(), new TransitionMetal.Copper());
        }
    }

    public static class Brass extends Alloy implements Conductive{
        public Brass(){
            super("Brass", new TransitionMetal.Copper(), new TransitionMetal.Zinc());
        }

        @Override
        public float percent_conductive() {
            return 0.28f;
        }
    }
}
