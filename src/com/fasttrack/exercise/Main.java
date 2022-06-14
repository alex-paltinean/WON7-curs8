package com.fasttrack.exercise;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat();

        System.out.println(cat.getSound());
        System.out.println(cat.isPurring());

        Lion lion = new Lion();
        System.out.println(lion.getSound());
        System.out.println(lion.isPurring());

    }
}
