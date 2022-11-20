package com.selfStudy.Zoo;

public abstract class Food {
    private final String foodName;

    public Food(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }
}
