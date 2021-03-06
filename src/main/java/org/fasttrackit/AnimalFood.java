package org.fasttrackit;

import java.time.LocalDate;

public class AnimalFood {
    private String name;
    protected double price;
    private double quantity;
    private LocalDate expirationDate;
    private boolean availability;
    private String flavour;
    private String shape;
    private int dosage;
    private String lotNumber;

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

    public AnimalFood(String name) {
        this.name = name;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public boolean isAvailability() {
        return availability;
    }

    public String getFlavour() {
        return flavour;
    }

    public String getShape() {
        return shape;
    }

    public int getDosage() {
        return dosage;
    }

    public String getLotNumber() {
        return lotNumber;
    }
}