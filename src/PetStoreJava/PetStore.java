package PetStoreJava;

import java.util.ArrayList;

public class PetStore {

    private ArrayList<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet){
        pets.add(pet);
    }

    public void countCats(){
        int counter = 0;
        for(Pet pet : pets){
            if(pet instanceof Cat){
                counter++;
            }
        }

        System.out.println("Number of Cats: " + counter);
    }

    public void countDogs(){
        int counter = 0;
        for(Pet pet : pets){
            if(pet instanceof Dog){
                counter++;
            }
        }

        System.out.println("Number of Dogs: " + counter);
    }

    public void countBirds(){
        int counter = 0;
        for(Pet pet : pets){
            if(pet instanceof Bird){
                counter++;
            }
        }

        System.out.println("Number of Birds: " + counter);
    }

    public void petStoreSounds(){
        for(Pet pet : pets){
            pet.makeSound();
        }
    }

    public void petStoreMoves(){
        for(Pet pet : pets){
            pet.move();
        }
    }
}
