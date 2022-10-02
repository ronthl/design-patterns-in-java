package dev.rontran;

public class AnimalFactory {

    public enum Type {
        TIGER, DOG
    }

    public Animal createAnimal(Type animalType) {
        switch (animalType) {
            case DOG:
                return new Dog();
            case TIGER:
                return new Tiger();
            default:
                throw new UnsupportedOperationException("Method does not support instantiating " + animalType);
        }
    }
}
