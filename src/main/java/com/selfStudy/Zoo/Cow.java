package com.selfStudy.Zoo;

import static com.selfStudy.Zoo.Size.BIG;

public class Cow extends Animal implements Swimmable, Voicable {

    private final Size animalSize = BIG;

    public Cow(String name, Size animalSize) {
        super(name, animalSize);
    }

    public Size getAnimalSize() {
        return animalSize;
    }

    public void swim() {
        System.out.println("Коровка плавает");
    }

    public void voice() {
        System.out.println("Му- му");
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
