package dev.rontran;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Demo with Simple Factory pattern ***");
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal = animalFactory.createAnimal(AnimalFactory.Type.TIGER);
        animal.displayBehavior();

        animal = animalFactory.createAnimal(AnimalFactory.Type.DOG);
        animal.displayBehavior();
    }
}
