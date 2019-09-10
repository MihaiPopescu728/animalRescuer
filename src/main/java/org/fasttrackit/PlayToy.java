package org.fasttrackit;

public class PlayToy extends RecreationalActivity {
    int durability;
    int fatigueLevel;

    public PlayToy(String name, String place, String dayOfWeek, String timeOfDay, String personName,
                   int durability, int fatigueLevel) {
        super(name, place, dayOfWeek, timeOfDay, personName);
        this.durability = durability;
        this.fatigueLevel = fatigueLevel;
    }

    @Override
    public String toString() {
        return "Frisbee{" +
                "durability=" + durability +
                ", fatigueLevel=" + fatigueLevel +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                ", timeOfDay='" + timeOfDay + '\'' +
                ", personName='" + personName + '\'' +
                '}';
    }
}
