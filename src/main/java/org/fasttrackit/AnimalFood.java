package org.fasttrackit;

import java.time.LocalDate;

public class AnimalFood {
    String name;
    double price;
    double quantity;
    public LocalDate expirationDate;
    boolean availability;
    String flavour;
    String shape;
    int dosage;
    String lotNumber;

    @Override
    public String toString() {
        return "AnimalFood{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", expirationDate=" + expirationDate +
                ", availability=" + availability +
                ", flavour='" + flavour + '\'' +
                ", shape='" + shape + '\'' +
                ", dosage=" + dosage +
                ", lotNumber='" + lotNumber + '\'' +
                '}';
    }

    public AnimalFood(String name, double price, double quantity, LocalDate expirationDate,
                      boolean availability, String flavour, String shape, int dosage, String lotNumber) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.availability = availability;
        this.flavour = flavour;
        this.shape = shape;
        this.dosage = dosage;
        this.lotNumber = lotNumber;
    }
}