package com.fasttrack.interfaces;

import java.util.List;

public class Company {
    private List<FoodProvider> foodProviders;

    public Company(List<FoodProvider> foodProviders) {
        this.foodProviders = foodProviders;
    }

    public void sendFoodToEmployees(String name) {
        for (FoodProvider foodProvider : foodProviders) {
            if (foodProvider.getName().equals(name)) {
                System.out.println("Sending " + foodProvider.deliverFood() + " with number " + foodProvider.deliveredQuantity());
            }
        }
    }

    public void printReport() {
        for (FoodProvider foodProvider : foodProviders) {
            System.out.println(foodProvider.getName() + " has delivered " + foodProvider.deliveredQuantity() + " menus");
        }
    }
}
