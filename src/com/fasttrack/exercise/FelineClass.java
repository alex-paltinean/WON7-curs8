package com.fasttrack.exercise;

import com.fasttrack.exercise.Feline;

public class FelineClass implements Feline {
    private String sound;
    private boolean purring;

    public FelineClass(String sound, boolean purring) {
        this.sound = sound;
        this.purring = purring;
    }

    String getSecretSound() {
        return "shhhh";
    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public boolean isPurring() {
        return purring;
    }


}
