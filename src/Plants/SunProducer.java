package Plants;

interface SunProducer {
    int produce_sun();
}

interface PlantUpgrade {
    int concurrentSunCost();
}

interface Attacker {
    int attack();
    // prints attack action
    // Print NAME + " attacks"
    // returns int of damage dealt

    int rangeType();
    // return int of range
    //    Single Line = 1
    //    AOE = 2
    //    Limited Range = 3
    //    Free Range = 4
}

interface InstantKiller {
    int killType();
    // Instant Killer = 1
    // Kill on Contact = 2
    void setHpToInfinite();
}

interface Upgradable {
    PlantUpgrade upgrade();
}
// add more interfaces here
