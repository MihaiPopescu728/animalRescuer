package org.fasttrackit;

public class Game {
    Adopter adopter;
    Animal animal;
    Veterinarian veterinarian;

    @Override
    public String toString() {
        return "Game{" +
                "adopter=" + adopter +
                ", animal=" + animal +
                ", veterinarian=" + veterinarian +
                '}';
    }

    public Game (Adopter adopter, Animal animal, Veterinarian veterinarian) {
        this.adopter = adopter;
        this.animal = animal;
        this.veterinarian = veterinarian;
    }
}