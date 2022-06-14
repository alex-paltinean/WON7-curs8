package com.fasttrack.interfaces;

public class McDonalds implements FoodProvider {
    private final String NAME = "mcDonalds";
    private int quantity = 0;

    @Override
    public String deliverFood() {
        quantity++;
        return "burgers";
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
