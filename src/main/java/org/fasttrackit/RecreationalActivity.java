package org.fasttrackit;

public class RecreationalActivity {
    protected String name;
    protected String place;
    protected String dayOfWeek;
    protected String timeOfDay;
    protected String personName;

    public RecreationalActivity(String name, String place, String dayOfWeek, String timeOfDay, String personName) {
        this.name = name;
        this.place = place;
        this.dayOfWeek = dayOfWeek;
        this.timeOfDay = timeOfDay;
        this.personName = personName;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public String getPersonName() {
        return personName;
    }
}
