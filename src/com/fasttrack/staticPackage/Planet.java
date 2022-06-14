package com.fasttrack.staticPackage;

public class Planet {

    static final long GRAVITY_COEFICIENT = 13;
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name + GRAVITY_COEFICIENT;
    }

    public static long getGravityCoeficient() {
        return GRAVITY_COEFICIENT;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "gravityCoeficient=" + GRAVITY_COEFICIENT +
                ", name='" + name + '\'' +
                '}';
    }
}
