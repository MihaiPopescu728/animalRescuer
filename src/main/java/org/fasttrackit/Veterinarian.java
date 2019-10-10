package org.fasttrackit;

public class Veterinarian {
    protected String name;
    protected String specialization;
    protected String priceLevel;
    protected String adress;
    protected String phoneNumber;
    protected String rating;

    public Veterinarian(String name, String specialization, String priceLevel, String adress, String phoneNumber, String rating) {
        this.name = name;
        this.specialization = specialization;
        this.priceLevel = priceLevel;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", priceLevel='" + priceLevel + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setPriceLevel(String priceLevel) {
        this.priceLevel = priceLevel;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getPriceLevel() {
        return priceLevel;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getRating() {
        return rating;
    }
}
