package org.fasttrackit;

public class Cat extends Animal {
    String furrColor;


    public Cat(String name, int age, int healthLevel, int hungerLevel, int spiritLevel, AnimalFood favoriteFood, RecreationalActivity favoriteActivity, String idChip, String favoriteToy, String countryOfOrigin, String species, String furrColor) {
        super(name, age, healthLevel, hungerLevel, spiritLevel, favoriteFood, favoriteActivity, idChip, favoriteToy, countryOfOrigin, species);
        this.furrColor = furrColor;
    }

    public String getFurrColor() {
        return furrColor;
    }

    public void setFurrColor(String furrColor) {
        this.furrColor = furrColor;
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
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

    @Override
    public void showHappiness() {
        System.out.println(name + " cuddles and purrs ");
    }
}
