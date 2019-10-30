package org.fasttrackit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private Adopter adopter;
    private Animal animal;
    private Veterinarian veterinarian;
    private List<AnimalFood> availableFood = new ArrayList();
    private RecreationalActivity[] availableActivities = new RecreationalActivity[10];


    public List<AnimalFood> getAvailableFood() {
        return availableFood;
    }

    public void setAvailableFood(List<AnimalFood> availableFood) {
        this.availableFood = availableFood;
    }

    public RecreationalActivity[] getAvailableActivities() {
        return availableActivities;
    }

    public void setAvailableActivities(RecreationalActivity[] availableActivities) {
        this.availableActivities = availableActivities;
    }

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

    private void initFood() {
        AnimalFood animalFood1 = new AnimalFood("Purina", 10, 15, LocalDate.of(2020,
                10, 26), true, "chicken", "cube", 1,
                "1E321");
        AnimalFood animalFood2 = new AnimalFood("Chapee", 15, 10, LocalDate.of(2020,
                9, 26), true, "beef", "cube", 2, "1FS1");
        availableFood.add(animalFood1);

        getAvailableFood().add(animalFood2);
    }

    private void initActivities() {
        RecreationalActivity recreationalActivity1 = new RecreationalActivity("running", "park",
                "wednesday", "afternoon", "Mihai");
        RecreationalActivity recreationalActivity2 = new RecreationalActivity("frisbee", "beach",
                "friday", "evening", "Robert");
        availableActivities[0] = recreationalActivity1;
        availableActivities[1] = recreationalActivity2;
    }

    public void start() {
        initFood();
        initActivities();
        showAvailableFood();
        showAvailableActivities();
    }

    public void showAvailableFood() {
        System.out.println("Available food: ");
        for (AnimalFood animalFood : availableFood) {
            System.out.println(animalFood.getName());
        }
    }

    public void showAvailableActivities() {
        System.out.println("Available activities: ");
        for (int i = 0; i < availableActivities.length; i++) {
            if (availableActivities[i] != null) {
                System.out.println(availableActivities[i].getName());
            }
        }
    }
}