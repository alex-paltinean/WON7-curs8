package com.fasttrack.interfaces;

public class KFC implements FoodProvider {

    private final String NAME = "kfc";
    private int quantity = 0;

    @Override
    public String deliverFood() {
        quantity++;
        return "crispy";
    }

    @Override
    public int deliveredQuantity() {
        return quantity;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
