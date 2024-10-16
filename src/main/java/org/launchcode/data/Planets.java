package org.launchcode.data;

public enum Planets {

    MERCURY("Mercury", 88, 3032),
    VENUS("Venus", 225, 7521),
    EARTH("Earth", 365, 7926),
    MARS("Mars", 687, 4221),
    JUPITER("Jupiter", 4333, 88846),
    SATURN("Saturn", 10759, 74898),
    URANUS("Uranus", 30687, 31763),
    NEPTUNE("Neptune", 60200, 30775);

    private final String name;
    private int yearLength;
    private int diameter;

    Planets(String name, int yearLength, int diameter) {
        this.name = name;
        this.yearLength = yearLength;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

    public int getDiameter() {
        return diameter;
    }
}

