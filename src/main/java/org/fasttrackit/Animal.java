package org.fasttrackit;

public class Animal {
       String name;
       int age;
       int healthLevel;
       int hungerLevel;
       int spiritLevel;
       AnimalFood favoriteFood;
       RecreationalActivity favoriteActivity;
       String idChip;
       String favoriteToy;
       String countryOfOrigin;
       String species;


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
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

    public Animal(String name, int age, int healthLevel, int hungerLevel, int spiritLevel, AnimalFood favoriteFood,
                  RecreationalActivity favoriteActivity, String idChip, String favoriteToy, String countryOfOrigin,
                  String species) {
        this.name = name;
        this.age = age;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.spiritLevel = spiritLevel;
        this.favoriteFood = favoriteFood;
        this.favoriteActivity = favoriteActivity;
        this.idChip = idChip;
        this.favoriteToy = favoriteToy;
        this.countryOfOrigin = countryOfOrigin;
        this.species = species;
    }
}
