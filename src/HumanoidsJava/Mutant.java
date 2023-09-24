package HumanoidsJava;

class Mutant extends Humanoid {
    private boolean hasSuperpowers;

    public boolean getHasSuperpowers(){
        return hasSuperpowers;
    }

    public Mutant(String name, char gender, int age) {
        super(name, gender, age);
    }

    public void gainPower(){
        hasSuperpowers = true;
    }

    public String toString(){
        return super.toString() + "Has superpowers: " + hasSuperpowers + ". ";
    }
}
