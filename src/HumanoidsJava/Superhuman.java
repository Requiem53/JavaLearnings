package HumanoidsJava;

class SuperHuman extends Humanoid {
    private int strength;

    public SuperHuman(String name, char gender, int age) {
        super(name, gender, age);
    }

    public int getStrength(){
        return  strength;
    }

    public void increaseStrength(int amount){
        strength+=amount;
    }

    public String toString(){
        return super.toString() + "Strength: " + strength + ". ";
    }
}
