package org.fasttrackit;

public class Adopter {
    protected String name;
    protected double moneySum;
    protected String personalNumericCode;
    protected String phoneNumber;
    protected String adress;
    protected int yearOfBirth;

    public Adopter(String name, double moneySum, String personalNumericCode,
                   String phoneNumber, String adress, int yearOfBirth) {
        this.name = name;
        this.moneySum = moneySum;
        this.personalNumericCode = personalNumericCode;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.yearOfBirth = yearOfBirth;
    }
    @Override
    public String toString() {
        return "Adopter{" +
                "name='" + name + '\'' +
                ", moneySum=" + moneySum +
                ", personalNumericCode='" + personalNumericCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adress='" + adress + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoneySum(double moneySum) {
        this.moneySum = moneySum;
    }

    public String getName() {
        return name;
    }

    public double getMoneySum() {
        return moneySum;
    }

    public String getPersonalNumericCode() {
        return personalNumericCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setPersonalNumericCode(String personalNumericCode) {
        this.personalNumericCode = personalNumericCode;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void feed(Animal animal, AnimalFood food){
        System.out.println(this.name+ " just gave some " + food.name +" to " + animal.name);
        animal.decreaseHungerLevel();

    }

    public void doRecreationActivity(Animal animal, RecreationalActivity recreationalActivity){
        System.out.println(this.name + "  " + recreationalActivity.name + " " + animal.name);
        animal.increaseSpiritLevel();
    }
}
