package com.fasttrack.staticPackage;

public class StaticEx {
    public static void main(String[] args) {
        Planet planet1 = new Planet("Earth");
        System.out.println(planet1.getName());
        System.out.println(Planet.getGravityCoeficient());

        Planet planet2 = new Planet("Venus");

        System.out.println(planet1);
        System.out.println(planet2);
    }

}
