package org.fasttrackit;

import java.time.LocalDate;
import java.util.*;

public class Game {
    private Adopter adopter;
    private Animal animal;
    private Veterinarian veterinarian;
    private List<AnimalFood> availableFood = new ArrayList();
    private RecreationalActivity[] availableActivities = new RecreationalActivity[2];

    public void start() {
        initFood();
        initActivities();
        showAvailableFood();
        showAvailableActivities();


        initAnimal();
        initRescuer();
        nameAnimal();
        animal.setHungerLevel(5);
        animal.setSpiritLevel(5);

        int rounds = 5;
        boolean won = false;
        for (int i = 0; i < rounds; i++) {
            System.out.println("YOU HAVE " + (rounds - i) + " ROUNDS REMAINING ");
            requireFeeding();
            requirePlaying();
            System.out.println("*****************************");
            System.out.println("ANIMAL HUNGER LEVEL: " + animal.getHungerLevel());
            System.out.println("ANIMAL SPIRIT LEVEL: " + animal.getSpiritLevel());
            System.out.println("*****************************");
            System.out.println();
            if (animal.getHungerLevel() <= 4 && animal.getSpiritLevel() >= 8) {
                System.out.println("YOU WON");
                won = true;
                break;
            }

        }
        if (!won) {
            System.out.println("GAME OVER");
        }

    }

    public Animal getAnimal() {
        return animal;
    }

    private void requireFeeding() {
        for (int i = 0; i < availableFood.size(); i++) {
            System.out.println(i + 1 + " " + availableFood.get(i).getName());

        }
        boolean ok = false;
        while (!ok) {
            System.out.println("Choose from available food: ");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            if (choice.toLowerCase().equals("x")) {
                System.out.println("The animal wasn't fed");
                return;

            }
            try {
                AnimalFood chosenFood = availableFood.get(Integer.parseInt(choice) - 1);
                adopter.feed(animal, chosenFood);
                ok = true;
            } catch (Exception e) {
                System.out.println("Invalid index");
            }
        }
    }


    private void requirePlaying() {
        for (int i = 0; i < availableActivities.length; i++) {
            System.out.println(i + 1 + " " + availableActivities[i].getName());

        }
        boolean ok = false;
        while (!ok) {
            System.out.println("Choose from available activities: ");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            if (choice.toLowerCase().equals("x")) {
                System.out.println("You haven't played with the animal");
                return;

            }
            try {
                RecreationalActivity recreationalActivity = availableActivities[Integer.parseInt(choice) - 1];
                adopter.doRecreationActivity(animal, recreationalActivity);
                ok = true;
            } catch (Exception e) {
                System.out.println("Invalid index");
            }
        }
    }


    public Game(Adopter adopter, Animal animal, Veterinarian veterinarian) {
        this.adopter = adopter;
        this.animal = animal;
        this.veterinarian = veterinarian;
    }

    private void initRescuer() {
        adopter = new Adopter();
        Scanner sc = new Scanner(System.in);
        String name = null;
        boolean ok = false;
        while (ok == false) {
            System.out.println("Input valid name of adopter: ");
            name = sc.nextLine();
            if (StringHandler.isValidName(name)) {
                ok = true;
            }
        }
        adopter.setName(name);

    }

    private void initAnimal() {

        boolean ok = false;
        while (!ok) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input animal type: (1 for dog, 2 for cat)");
            String species = scanner.nextLine();
            if (species.toLowerCase().equals("1")) {
                animal = new Dog();
                ok = true;
                animal.setAge(3);
                animal.setCountryOfOrigin("United Kingdom");
                animal.setFavoriteActivity(new RecreationalActivity("running"));
                animal.setFavoriteFood(new AnimalFood("Purina"));
                animal.setFavoriteToy("frisbee");
                animal.setIdChip("ABC4R3");
                animal.setHealthLevel(5);
                animal.setHungerLevel(2);
                animal.setSpiritLevel(8);
                animal.setSpecies("dog");
            } else if (species.equals("2")) {
                animal = new Cat();
                ok = true;
                animal.setAge(2);
                animal.setCountryOfOrigin("Italy");
                animal.setFavoriteActivity(new RecreationalActivity("playing with ball"));
                animal.setFavoriteFood(new AnimalFood("Wiskas"));
                animal.setFavoriteToy("ball");
                animal.setIdChip("NFDSFNJ2");
                animal.setHealthLevel(6);
                animal.setHungerLevel(4);
                animal.setSpiritLevel(4);
                animal.setSpecies("cat");
            } else {
                System.out.println("Please select from available animals: ");
            }


        }
    }

    private void nameAnimal() {
        Scanner sc = new Scanner(System.in);
        String name = null;
        boolean ok = false;
        while (ok == false) {
            System.out.println("Input valid name of animal: ");
            name = sc.nextLine();
            if (StringHandler.isValidName(name)) {
                ok = true;
            }
        }
        animal.setName(name);
    }

    public Game() {

    }

    private void initFood() {
        AnimalFood animalFood1 = new AnimalFood("Purina", 10, 15, LocalDate.of(2020,
                10, 26), true, "chicken", "cube", 1,
                "1E321");
        AnimalFood animalFood2 = new AnimalFood("Chapee", 15, 10, LocalDate.of(2020,
                9, 26), true, "beef", "cube", 2, "1FS1");

        availableFood.add(animalFood1);

        availableFood.add(animalFood2);
    }

    private void initActivities() {
        RecreationalActivity recreationalActivity1 = new RecreationalActivity("running", "park",
                "wednesday", "afternoon", "Mihai");
        RecreationalActivity recreationalActivity2 = new RecreationalActivity("frisbee", "beach",
                "friday", "evening", "Robert");
        availableActivities[0] = recreationalActivity1;
        availableActivities[1] = recreationalActivity2;
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