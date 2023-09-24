package PetStoreJava;

public class Dog extends Pet{
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void move() {
        System.out.println("Runs");
    }
}
