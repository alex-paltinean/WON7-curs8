package com.fasttrack.inheritance;

public class RomanianOmvWorker implements Employee {

    private String salary;
    private int age;
    private String name;

    public RomanianOmvWorker(String salary, int age, String name) {
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

    @Override
    public String getHomeCountry() {
        return "Romania";
    }

    @Override
    public String getSalary() {
        return salary;
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
