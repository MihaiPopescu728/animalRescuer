package org.fasttrackit;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Adopter adopter = new Adopter("Mihai", 200, "222222222",
                "12345678", "Street Republicii", 1986);
        System.out.println(adopter);

        AnimalFood animalFood1 = new AnimalFood("Pedigree", 10.99, 5.5, LocalDate.of(2020,
                10, 26), true, "Chicken", "cube", 3,
                "123456789");

        System.out.println(animalFood1);

        RecreationalActivity activity1 = new RecreationalActivity("frisbee", "Park", "Everyday",
                "Evening", "Amalia");

        Veterinarian doctor1 = new Veterinarian("Robert", "surgeon", "Average",
                "Street Lunii", "1233456", "Very good");

        Animal animal1 = new Animal("Labish", 4, 9, 10, 10, animalFood1,
                activity1, "1E25CD255", "bone", "USA", "dog");

        Game game1 = new Game(adopter, animal1, doctor1);
        System.out.println(game1);

        VeterinaryClinic veterinaryClinic1 = new VeterinaryClinic("Dog heaven", doctor1);
        System.out.println(veterinaryClinic1);

        Dog dog1 = new Dog("Scooby", 3, 10, 0, 10, animalFood1,
                activity1, "7E2456CD55", "Bone", "USA",
                "dog", "Rotweiler", 10);
        System.out.println(dog1);

        PersonTakingCare person1 = new PersonTakingCare("Robert", 300, "11111",
                "3333333", "Street Nicolae Titulescu", 1999, 10, "" +
                "radu@none.com");
        System.out.println(person1);

        PlayToy toy = new PlayToy("Frisbee", "Park", "Everyday", "Evening",
                "Mihai", 10, 3);

        System.out.println("---------------------------------------------------------------");
        System.out.println("Before feeding :");
        System.out.println(animal1);
        adopter.feed(animal1, animalFood1);
        adopter.feed(animal1, animalFood1);
        System.out.println("After feeding: ");
        System.out.println(animal1);

        System.out.println("---------------------------------------------------------------");
        adopter.doRecreationActivity(animal1, activity1);
        System.out.println(animal1);

        System.out.println("---------------------------------------------------------------");

        Animal animall = new Animal();
        animall.showHappiness();

        Animal dog2 = new Dog();
        dog1.showHappiness();

        System.out.println("---------------------------------------------------------------");
        adopter.doRecreationActivity(animal1, activity1);
        adopter.feed(animal1, animalFood1);

        System.out.println("---------------------------------------------------------------");
        Animal animal3 = new Animal();
        Animal dog5 = new Dog();

        animal1.showHappiness();
        game1.start();
    }
}
