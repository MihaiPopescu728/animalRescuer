package org.fasttrackit;

public class Dog extends Animal{

    String race;
    int friendlinessLevel;

    public Dog(String name, int age, int healthLevel, int hungerLevel, int spiritLevel, AnimalFood favoriteFood,
               RecreationalActivity favoriteActivity, String idChip,
               String favoriteToy, String countryOfOrigin, String species, String race, int friendlinessLevel) {
        super(name, age, healthLevel, hungerLevel, spiritLevel, favoriteFood, favoriteActivity, idChip, favoriteToy,
                countryOfOrigin, species);
        this.race = race;
        this.friendlinessLevel = friendlinessLevel;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "race='" + race + '\'' +
                ", friendlinessLevel=" + friendlinessLevel +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", healthLevel=" + healthLevel +
                ", hungerLevel=" + hungerLevel +
                ", spiritLevel=" + spiritLevel +
                ", favoriteFood=" + favoriteFood +
                ", favoriteActivity=" + favoriteActivity +
                ", idChip='" + idChip + '\'' +
                ", favoriteToy='" + favoriteToy + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
