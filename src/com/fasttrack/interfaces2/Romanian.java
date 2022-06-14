package com.fasttrack.interfaces2;

public class Romanian implements Citizen {
    private int age;
    private String name;

    public Romanian(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String getHomeCountry() {
        return "Romania";
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
}
