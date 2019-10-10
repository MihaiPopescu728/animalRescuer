package org.fasttrackit;

public class Game {
    private Adopter adopter;
    private Animal animal;
    private Veterinarian veterinarian;

    public Game(Adopter adopter, Animal animal, Veterinarian veterinarian) {
        this.adopter = adopter;
        this.animal = animal;
        this.veterinarian = veterinarian;
    }

    @Override
    public String toString() {
        return "Game{" +
                "adopter=" + adopter +
                ", animal=" + animal +
                ", veterinarian=" + veterinarian +
                '}';
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }
}