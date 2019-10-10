package org.fasttrackit;

public class VeterinaryClinic {
    protected String name;
    protected Veterinarian veterinarian1;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setVeterinarian1(Veterinarian veterinarian1) {
        this.veterinarian1 = veterinarian1;
    }

    public String getName() {
        return name;
    }

    public Veterinarian getVeterinarian1() {
        return veterinarian1;
    }
}
