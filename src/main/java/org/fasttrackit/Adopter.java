package org.fasttrackit;

public class Adopter {
    String name;
    double moneySum;
    String personalNumericCode;
    String phoneNumber;
    String adress;
    int yearOfBirth;

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


    public Adopter(String name, double moneySum, String personalNumericCode,
                   String phoneNumber, String adress, int yearOfBirth) {
        this.name = name;
        this.moneySum = moneySum;
        this.personalNumericCode = personalNumericCode;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.yearOfBirth = yearOfBirth;
    }
}
