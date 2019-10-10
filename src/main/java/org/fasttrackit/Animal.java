package org.fasttrackit;

public class Animal {
       protected String name;
       protected int age;
       protected int healthLevel;
       protected int hungerLevel;
       protected int spiritLevel;
       protected AnimalFood favoriteFood;
       protected RecreationalActivity favoriteActivity;
       protected String idChip;
       protected String favoriteToy;
       protected String countryOfOrigin;
       protected String species;

    public Animal(){

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

    public void showHappiness (){
        System.out.println("The animal is happy!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void setSpiritLevel(int spiritLevel) {
        this.spiritLevel = spiritLevel;
    }

    public void setFavoriteFood(AnimalFood favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void setFavoriteActivity(RecreationalActivity favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public void setIdChip(String idChip) {
        this.idChip = idChip;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getSpiritLevel() {
        return spiritLevel;
    }

    public AnimalFood getFavoriteFood() {
        return favoriteFood;
    }

    public RecreationalActivity getFavoriteActivity() {
        return favoriteActivity;
    }

    public String getIdChip() {
        return idChip;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getSpecies() {
        return species;
    }


    public void decreaseHungerLevel(){
        this.hungerLevel--;
    }

    public void increaseSpiritLevel(){
        this.spiritLevel++;
    }
}
