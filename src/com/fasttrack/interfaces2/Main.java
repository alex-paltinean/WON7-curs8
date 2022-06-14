package com.fasttrack.interfaces2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> individuals = new ArrayList<>();
        List<Citizen> population = new ArrayList<>();
        List<Employee> workingClass = new ArrayList<>();

        RomanianOmvWorker romanianOmvWorker = new RomanianOmvWorker("10RON", 20, "Gigi");
        individuals.add(romanianOmvWorker);
        population.add(romanianOmvWorker);
        workingClass.add(romanianOmvWorker);

        System.out.println(romanianOmvWorker.getAge());

        Romanian romanian = new Romanian(10, "Gogo");
        individuals.add(romanian);
        population.add(romanian);
    }
}
