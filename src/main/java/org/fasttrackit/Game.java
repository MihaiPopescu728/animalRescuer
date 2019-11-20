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


        if (!initAnimal()) {
            return;
        }
        initRescuer();
        nameAnimal();
        animal.setHungerLevel(10);
        animal.setSpiritLevel(1);

        int rounds = 10;
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
        System.out.println("Enter index of food. Enter X  if you don't want to feed");
        Scanner sc = new Scanner(System.in);
        String food = sc.nextLine();
        if (food.toLowerCase().equals("x")) {
            System.out.println("The animal wasn't fed");
            return;
        }
        Map<Integer, AnimalFood> foodMap = new HashMap<>();
        for (int i = 0; i < availableFood.size(); i++) {
            foodMap.put(i + 1, availableFood.get(i));
        }
        try {
            AnimalFood chosenFood = foodMap.get(Integer.parseInt(food));
            adopter.feed(animal, chosenFood);
        } catch (Exception e) {
            System.out.println("Invalid index");
        }


    }

    private void requirePlaying() {
        for (int i = 0; i < availableActivities.length; i++) {
            System.out.println(i + 1 + " " + availableActivities[i].getName());

        }
        System.out.println("Enter index of activity. Enter X  if you don't want to play");
        Scanner sc = new Scanner(System.in);
        String activity = sc.nextLine();

        System.out.println(adopter);
        System.out.println(animal);
        if (activity.toLowerCase().equals("x")) {
            System.out.println("The adopter hasn't played with the animal");
            return;
        }
        Map<Integer, RecreationalActivity> activityMap = new HashMap<>();
        for (int i = 0; i < availableActivities.length; i++) {
            activityMap.put(i + 1, availableActivities[i]);
        }
        try {
            RecreationalActivity recreationalActivity = activityMap.get(Integer.parseInt(activity));
            adopter.doRecreationActivity(animal, recreationalActivity);
        } catch (Exception e) {
            System.out.println("Invalid index");
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
            if (name.matches("[a-zA-Z]+")) {
                ok = true;
            }
        }
        adopter.setName(name);

    }

    private boolean initAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input animal type: ");
        String species = scanner.nextLine();
        if (species.toLowerCase().equals("dog")) {
            animal = new Dog();
        } else {
            System.out.println("Type doesn't exist ");
            return false;
        }

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
        ((Dog) animal).setRace("pitbull");
        ((Dog) animal).setFriendlinessLevel(5);
        return true;

    }

    private void nameAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input animal name: ");
        String name = sc.next();
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