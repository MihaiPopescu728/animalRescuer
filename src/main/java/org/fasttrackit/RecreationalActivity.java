package org.fasttrackit;

public class RecreationalActivity {
    String name;
    String place;
    String dayOfWeek;
    String timeOfDay;
    String personName;

    @Override
    public String toString() {
        return "RecreationalActivity{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                ", timeOfDay='" + timeOfDay + '\'' +
                ", personName='" + personName + '\'' +
                '}';
    }

    public RecreationalActivity(String name, String place, String dayOfWeek, String timeOfDay, String personName) {
        this.name = name;
        this.place = place;
        this.dayOfWeek = dayOfWeek;
        this.timeOfDay = timeOfDay;
        this.personName = personName;
    }
}
