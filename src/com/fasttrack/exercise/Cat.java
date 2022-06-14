package com.fasttrack.exercise;

public class Cat extends FelineClass {
    public Cat() {
        super("miau", true);
    }

    public void printSomething(){
        System.out.println(this.getSecretSound());
    }
}
