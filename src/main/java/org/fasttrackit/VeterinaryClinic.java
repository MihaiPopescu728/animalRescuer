package org.fasttrackit;

public class VeterinaryClinic {
    String name;
    Veterinarian veterinarian1;

    public VeterinaryClinic(String name, Veterinarian veterinarian1) {
        this.name = name;
        this.veterinarian1 = veterinarian1;
    }

    @Override
    public String toString() {
        return "VeterinaryClinic{" +
                "name='" + name + '\'' +
                ", veterinarian1=" + veterinarian1 +
                '}';
    }
}