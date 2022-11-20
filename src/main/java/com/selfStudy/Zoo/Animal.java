package com.selfStudy.Zoo;

public abstract class Animal {
    private String name;
    private int satiety;

    private final Size animalSize;

    public Animal(String name, Size animalSize) {
        this.name = name;
        this.animalSize = animalSize;
    }

    public Size getAnimalSize() {
        return animalSize;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getAnimalName() {
        System.out.println(getName());
    }

    public abstract int eat(Food food);

    public abstract void voice();
}
