package com.fasttrack.interfaces;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Company fastTrackIT = new Company(Arrays.asList(new McDonalds(), new KFC()));

        for (int i = 0; i < 10; i++) {
            fastTrackIT.sendFoodToEmployees("mcDonalds");
        }
        for (int i = 0; i < 5; i++) {
            fastTrackIT.sendFoodToEmployees("kfc");
        }

        fastTrackIT.printReport();
    }
}
