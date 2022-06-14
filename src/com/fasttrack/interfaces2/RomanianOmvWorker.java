package com.fasttrack.interfaces2;

public class RomanianOmvWorker extends Romanian implements Employee {

    private String salary;

    public RomanianOmvWorker(String salary, int age, String name) {
        super(age, name);
        this.salary = salary;
    }

    @Override
    public String getSalary() {
        return salary;
    }
}
