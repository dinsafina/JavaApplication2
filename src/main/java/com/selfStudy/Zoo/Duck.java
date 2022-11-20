package com.selfStudy.Zoo;

import static com.selfStudy.Zoo.Size.SMALL;

public class Duck extends Animal implements Swimmable, Voicable, Flyable {
    private final Size animalSize = SMALL;

    public Duck(String name, Size animalSize) {
        super(name, animalSize);
    }

    public Size getAnimalSize() {
        return animalSize;
    }

    public void swim() {
        System.out.println("Уточка плавает");
    }

    public void voice() {
        System.out.println("Кря-кря!");
    }

    public void fly() {
        System.out.println("Уточка летает");
    }

    public int eat(Food food) {
        if (food instanceof Grass) {
            int satiety = this.getSatiety() + 5;
            this.setSatiety(satiety);
            return satiety;
        } else {
            throw new IllegalArgumentException("не верный тип еды");
        }
    }
}
