package Elementals;

public interface Conductive {
    float percent_conductive();
}

interface Magnetic{
    int magnetic_strength();
    int magnetic_type();
}

interface Radioactive{
    int half_life();
    default void radiate(){
        System.out.println(this + " emitting radiation");
    }
}