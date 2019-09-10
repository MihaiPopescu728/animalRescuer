package org.fasttrackit;

public class Veterinarian {
    String name;
    String specialization;
    String priceLevel;
    String adress;
    String phoneNumber;
    String rating;

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

    public Veterinarian(String name, String specialization, String priceLevel, String adress, String phoneNumber, String rating) {
        this.name = name;
        this.specialization = specialization;
        this.priceLevel = priceLevel;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.rating = rating;
    }
}
