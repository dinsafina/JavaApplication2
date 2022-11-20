package com.selfStudy.Zoo;

import static com.selfStudy.Zoo.Size.SMALL;

public class Fish extends Animal implements Swimmable {
    private final Size animalSize = SMALL;

    public Fish(String name, Size animalSize) {
        super(name, animalSize);
    }

    public Size getAnimalSize() {
        return animalSize;
    }

    public void swim() {
        System.out.println("Рыбка плывет");
    }

    public int eat(Food food) {
        if (food instanceof Meat) {
            int satiety = this.getSatiety() + 10;
            this.setSatiety(satiety);
            return satiety;
        } else {
            throw new IllegalArgumentException("не верный тип еды");
        }
    }

    @Override
    public void voice() {
        System.out.println();
    }
}
