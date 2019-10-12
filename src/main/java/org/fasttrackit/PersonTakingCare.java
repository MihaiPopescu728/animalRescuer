package org.fasttrackit;

public class PersonTakingCare extends Adopter {
    private int availability;
    private String email;

    public PersonTakingCare(String name, double moneySum, String personalNumericCode, String phoneNumber,
                            String adress, int yearOfBirth, int availability, String email) {
        super(name, moneySum, personalNumericCode, phoneNumber, adress, yearOfBirth);
        this.availability = availability;
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonTakingCare{" +
                "availability=" + availability +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", moneySum=" + moneySum +
                ", personalNumericCode='" + personalNumericCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adress='" + adress + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAvailability() {
        return availability;
    }

    public String getEmail() {
        return email;
    }
}
